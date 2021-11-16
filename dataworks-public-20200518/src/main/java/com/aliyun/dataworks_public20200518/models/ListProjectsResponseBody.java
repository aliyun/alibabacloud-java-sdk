// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("PageResult")
    public ListProjectsResponseBodyPageResult pageResult;

    @NameInMap("RequestId")
    public String requestId;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setPageResult(ListProjectsResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListProjectsResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectsResponseBodyPageResultProjectList extends TeaModel {
        @NameInMap("ProjectDescription")
        public String projectDescription;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        @NameInMap("ProjectStatus")
        public Integer projectStatus;

        @NameInMap("ProjectStatusCode")
        public String projectStatusCode;

        public static ListProjectsResponseBodyPageResultProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPageResultProjectList self = new ListProjectsResponseBodyPageResultProjectList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPageResultProjectList setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public ListProjectsResponseBodyPageResultProjectList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListProjectsResponseBodyPageResultProjectList setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public ListProjectsResponseBodyPageResultProjectList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListProjectsResponseBodyPageResultProjectList setProjectOwnerBaseId(String projectOwnerBaseId) {
            this.projectOwnerBaseId = projectOwnerBaseId;
            return this;
        }
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        public ListProjectsResponseBodyPageResultProjectList setProjectStatus(Integer projectStatus) {
            this.projectStatus = projectStatus;
            return this;
        }
        public Integer getProjectStatus() {
            return this.projectStatus;
        }

        public ListProjectsResponseBodyPageResultProjectList setProjectStatusCode(String projectStatusCode) {
            this.projectStatusCode = projectStatusCode;
            return this;
        }
        public String getProjectStatusCode() {
            return this.projectStatusCode;
        }

    }

    public static class ListProjectsResponseBodyPageResult extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ProjectList")
        public java.util.List<ListProjectsResponseBodyPageResultProjectList> projectList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListProjectsResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPageResult self = new ListProjectsResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPageResult setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectsResponseBodyPageResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListProjectsResponseBodyPageResult setProjectList(java.util.List<ListProjectsResponseBodyPageResultProjectList> projectList) {
            this.projectList = projectList;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyPageResultProjectList> getProjectList() {
            return this.projectList;
        }

        public ListProjectsResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
