// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListProjectsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SortType")
    public String sortType;

    @NameInMap("StateList")
    public java.util.List<Integer> stateList;

    public static ListProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsRequest self = new ListProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListProjectsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListProjectsRequest setSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }
    public String getSortType() {
        return this.sortType;
    }

    public ListProjectsRequest setStateList(java.util.List<Integer> stateList) {
        this.stateList = stateList;
        return this;
    }
    public java.util.List<Integer> getStateList() {
        return this.stateList;
    }

}
