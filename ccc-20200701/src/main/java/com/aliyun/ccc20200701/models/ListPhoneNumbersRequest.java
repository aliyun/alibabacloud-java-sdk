// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersRequest extends TeaModel {
    /**
     * <p>Indicates whether the number is active. This parameter is optional. The default value is empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Active")
    public Boolean active;

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
     * <p>The paging ordinal number, ranging from 1 to 100.</p>
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
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Performs fuzzy matching based on the number. This parameter is optional and defaults to empty. An empty value indicates no filtering.</p>
     * 
     * <strong>example:</strong>
     * <p>0833</p>
     */
    @NameInMap("SearchPattern")
    public String searchPattern;

    /**
     * <p>Usage of the number. This parameter is optional. The default value is empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>Bidirection</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static ListPhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersRequest self = new ListPhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public ListPhoneNumbersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListPhoneNumbersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPhoneNumbersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPhoneNumbersRequest setSearchPattern(String searchPattern) {
        this.searchPattern = searchPattern;
        return this;
    }
    public String getSearchPattern() {
        return this.searchPattern;
    }

    public ListPhoneNumbersRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
