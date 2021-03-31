// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceApplicationsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectIdList")
    public String projectIdList;

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
