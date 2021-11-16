// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDataServiceGroupsRequest extends TeaModel {
    @NameInMap("GroupNameKeyword")
    public String groupNameKeyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static ListDataServiceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceGroupsRequest self = new ListDataServiceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceGroupsRequest setGroupNameKeyword(String groupNameKeyword) {
        this.groupNameKeyword = groupNameKeyword;
        return this;
    }
    public String getGroupNameKeyword() {
        return this.groupNameKeyword;
    }

    public ListDataServiceGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDataServiceGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDataServiceGroupsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDataServiceGroupsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
