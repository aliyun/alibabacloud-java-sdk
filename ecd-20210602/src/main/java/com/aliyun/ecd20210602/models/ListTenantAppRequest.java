// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppRequest extends TeaModel {
    /**
     * <p>The application name keyword, matched by containment. If this parameter is not specified or is set to an empty string, no name-based filtering is applied. <code>%</code> can be used as a wildcard, and <code>_</code> is matched as a literal character.</p>
     * 
     * <strong>example:</strong>
     * <p>SampleEditor</p>
     */
    @NameInMap("KeyName")
    public String keyName;

    /**
     * <p>The page number, starting from 1. If this parameter is not specified or is set to a value less than or equal to 0, the value 1 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500. If this parameter is not specified, is set to a value less than or equal to 0, or is set to a value greater than 500, the value 20 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The application source. Valid values:</p>
     * <ul>
     * <li>MARKET: marketplace applications.</li>
     * <li>TENANT: applications uploaded by the current tenant.</li>
     * </ul>
     * <p>If this parameter is not specified, both types of visible applications are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>TENANT</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ListTenantAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAppRequest self = new ListTenantAppRequest();
        return TeaModel.build(map, self);
    }

    public ListTenantAppRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ListTenantAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTenantAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTenantAppRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
