// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDoNotCallNumbersRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page number, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Scope of application, including SYSTEM and INSTANCE. SYSTEM corresponds to system-level Do Not Call configurations associated with the Alibaba Cloud account to which the instance belongs. INSTANCE corresponds to custom Do Not Call configurations specific to the current instance. This parameter is optional, with a default value of INSTANCE.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>Fuzzy matching based on phone number or remark. This parameter is optional, with a default value of empty, meaning no filtering is applied when empty.</p>
     * 
     * <strong>example:</strong>
     * <p>RemarkA</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    public static ListDoNotCallNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDoNotCallNumbersRequest self = new ListDoNotCallNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ListDoNotCallNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListDoNotCallNumbersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDoNotCallNumbersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDoNotCallNumbersRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListDoNotCallNumbersRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

}
