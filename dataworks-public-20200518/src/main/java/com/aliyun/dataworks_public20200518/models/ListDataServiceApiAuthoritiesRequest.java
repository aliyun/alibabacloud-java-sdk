// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApiAuthoritiesRequest extends TeaModel {
    /**
     * <p>The keyword in the name of the API. The keyword can be used to search for the API whose name contains the keyword.</p>
     */
    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceApiAuthoritiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApiAuthoritiesRequest self = new ListDataServiceApiAuthoritiesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApiAuthoritiesRequest setApiNameKeyword(String apiNameKeyword) {
        this.apiNameKeyword = apiNameKeyword;
        return this;
    }
    public String getApiNameKeyword() {
        return this.apiNameKeyword;
    }

    public ListDataServiceApiAuthoritiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceApiAuthoritiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceApiAuthoritiesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServiceApiAuthoritiesRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
