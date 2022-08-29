// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("LastProjectId")
    public Long lastProjectId;

    @NameInMap("OwnerUserId")
    public String ownerUserId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ProjectType")
    public Integer projectType;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListProjectsRequest setLastProjectId(Long lastProjectId) {
        this.lastProjectId = lastProjectId;
        return this;
    }
    public Long getLastProjectId() {
        return this.lastProjectId;
    }

    public ListProjectsRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public ListProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListProjectsRequest setProjectType(Integer projectType) {
        this.projectType = projectType;
        return this;
    }
    public Integer getProjectType() {
        return this.projectType;
    }

}
