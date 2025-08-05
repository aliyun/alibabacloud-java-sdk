// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListProjectsOfMemberResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListProjectsOfMemberResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListProjectsOfMemberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsOfMemberResponseBody self = new ListProjectsOfMemberResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsOfMemberResponseBody setData(ListProjectsOfMemberResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectsOfMemberResponseBodyData getData() {
        return this.data;
    }

    public ListProjectsOfMemberResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListProjectsOfMemberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsOfMemberResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectsOfMemberResponseBodyDataProjects extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("ProjectDesc")
        public String projectDesc;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectMode")
        public String projectMode;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        @NameInMap("Status")
        public String status;

        public static ListProjectsOfMemberResponseBodyDataProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsOfMemberResponseBodyDataProjects self = new ListProjectsOfMemberResponseBodyDataProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectsOfMemberResponseBodyDataProjects setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setEnvTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }
        public java.util.List<String> getEnvTypes() {
            return this.envTypes;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }
        public String getProjectDesc() {
            return this.projectDesc;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setProjectMode(String projectMode) {
            this.projectMode = projectMode;
            return this;
        }
        public String getProjectMode() {
            return this.projectMode;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setProjectOwnerBaseId(String projectOwnerBaseId) {
            this.projectOwnerBaseId = projectOwnerBaseId;
            return this;
        }
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        public ListProjectsOfMemberResponseBodyDataProjects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListProjectsOfMemberResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public String pageSize;

        @NameInMap("Projects")
        public java.util.List<ListProjectsOfMemberResponseBodyDataProjects> projects;

        @NameInMap("TotalCount")
        public String totalCount;

        public static ListProjectsOfMemberResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsOfMemberResponseBodyData self = new ListProjectsOfMemberResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectsOfMemberResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListProjectsOfMemberResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public ListProjectsOfMemberResponseBodyData setProjects(java.util.List<ListProjectsOfMemberResponseBodyDataProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<ListProjectsOfMemberResponseBodyDataProjects> getProjects() {
            return this.projects;
        }

        public ListProjectsOfMemberResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
