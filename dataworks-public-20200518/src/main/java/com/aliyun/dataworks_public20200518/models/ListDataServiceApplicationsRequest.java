// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsRequest extends TeaModel {
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
     * <p>The ID of the workspace based on which you want to query the basic information of applications. You can specify multiple IDs. Separate them with commas (,). You must specify at least one workspace ID. You can specify a maximum of 50 workspace IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectIdList")
    public String projectIdList;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceApplicationsRequest self = new ListDataServiceApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceApplicationsRequest setProjectIdList(String projectIdList) {
        this.projectIdList = projectIdList;
        return this;
    }
    public String getProjectIdList() {
        return this.projectIdList;
    }

    public ListDataServiceApplicationsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
