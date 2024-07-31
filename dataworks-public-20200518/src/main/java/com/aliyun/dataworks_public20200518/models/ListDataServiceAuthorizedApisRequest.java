// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceAuthorizedApisRequest extends TeaModel {
    /**
     * <p>The keyword in API names. The keyword is used to search for the APIs whose names contain the keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>My API Name</p>
     */
    @NameInMap("ApiNameKeyword")
    public String apiNameKeyword;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The tenant ID. This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceAuthorizedApisRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAuthorizedApisRequest self = new ListDataServiceAuthorizedApisRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAuthorizedApisRequest setApiNameKeyword(String apiNameKeyword) {
        this.apiNameKeyword = apiNameKeyword;
        return this;
    }
    public String getApiNameKeyword() {
        return this.apiNameKeyword;
    }

    public ListDataServiceAuthorizedApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceAuthorizedApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceAuthorizedApisRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServiceAuthorizedApisRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
