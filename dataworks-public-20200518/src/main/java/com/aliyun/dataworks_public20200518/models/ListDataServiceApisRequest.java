// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApisRequest extends TeaModel {
    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    /**
     * <p>The keyword in the name of the API. The keyword can be used to search for the API whose name contains the keyword.</p>
     */
    @NameInMap("ApiPathKeyword")
    public String apiPathKeyword;

    /**
     * <p>The keyword in the path of the API. The keyword can be used to search for the API whose path contains the keyword.</p>
     */
    @NameInMap("CreatorId")
    public String creatorId;

    /**
     * <p>The operation that you want to perform. Set the value to **ListDataServiceApis**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The number of entries to return on each page. Default value: 10. A maximum of 100 entries can be returned on each page.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApisRequest self = new ListDataServiceApisRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApisRequest setApiNameKeyword(String apiNameKeyword) {
        this.apiNameKeyword = apiNameKeyword;
        return this;
    }
    public String getApiNameKeyword() {
        return this.apiNameKeyword;
    }

    public ListDataServiceApisRequest setApiPathKeyword(String apiPathKeyword) {
        this.apiPathKeyword = apiPathKeyword;
        return this;
    }
    public String getApiPathKeyword() {
        return this.apiPathKeyword;
    }

    public ListDataServiceApisRequest setCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public String getCreatorId() {
        return this.creatorId;
    }

    public ListDataServiceApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceApisRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServiceApisRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
