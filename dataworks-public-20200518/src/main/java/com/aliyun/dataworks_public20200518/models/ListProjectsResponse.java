// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageResult")
    @Validation(required = true)
    public ListProjectsResponsePageResult pageResult;

    public static ListProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponse self = new ListProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponse setPageResult(ListProjectsResponsePageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListProjectsResponsePageResult getPageResult() {
        return this.pageResult;
    }

    public static class ListProjectsResponsePageResultProjectList extends TeaModel {
        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        @NameInMap("ProjectIdentifier")
        @Validation(required = true)
        public String projectIdentifier;

        @NameInMap("ProjectDescription")
        @Validation(required = true)
        public String projectDescription;

        @NameInMap("ProjectStatus")
        @Validation(required = true)
        public Integer projectStatus;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        @NameInMap("ProjectOwnerBaseId")
        @Validation(required = true)
        public String projectOwnerBaseId;

        @NameInMap("ProjectStatusCode")
        @Validation(required = true)
        public String projectStatusCode;

        public static ListProjectsResponsePageResultProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponsePageResultProjectList self = new ListProjectsResponsePageResultProjectList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponsePageResultProjectList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListProjectsResponsePageResultProjectList setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public ListProjectsResponsePageResultProjectList setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public ListProjectsResponsePageResultProjectList setProjectStatus(Integer projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public Integer getProjectStatus() {
            return this.projectStatus;
        }

        public ListProjectsResponsePageResultProjectList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListProjectsResponsePageResultProjectList setProjectOwnerBaseId(String projectOwnerBaseId) {
            this.projectOwnerBaseId = projectOwnerBaseId;
            return this;
        }
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        public ListProjectsResponsePageResultProjectList setProjectStatusCode(String projectStatusCode) {
            this.projectStatusCode = projectStatusCode;
            return this;
        }
        public String getProjectStatusCode() {
            return this.projectStatusCode;
        }

    }

    public static class ListProjectsResponsePageResult extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("ProjectList")
        @Validation(required = true)
        public java.util.List<ListProjectsResponsePageResultProjectList> projectList;

        public static ListProjectsResponsePageResult build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponsePageResult self = new ListProjectsResponsePageResult();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponsePageResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectsResponsePageResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectsResponsePageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListProjectsResponsePageResult setProjectList(java.util.List<ListProjectsResponsePageResultProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }
        public java.util.List<ListProjectsResponsePageResultProjectList> getProjectList() {
            return this.projectList;
        }

    }

}
