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

    public static class ListProjectsResponseBodyPageResultProjectListTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListProjectsResponseBodyPageResultProjectListTags build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPageResultProjectListTags self = new ListProjectsResponseBodyPageResultProjectListTags();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPageResultProjectListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProjectsResponseBodyPageResultProjectListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProjectsResponseBodyPageResultProjectList extends TeaModel {
        @NameInMap("DisableDevelopment")
        public Boolean disableDevelopment;

        @NameInMap("IsDefault")
        public Integer isDefault;

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

        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        @NameInMap("TablePrivacyMode")
        public Integer tablePrivacyMode;

        @NameInMap("Tags")
        public java.util.List<ListProjectsResponseBodyPageResultProjectListTags> tags;

        @NameInMap("UseProxyOdpsAccount")
        public Boolean useProxyOdpsAccount;

        public static ListProjectsResponseBodyPageResultProjectList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyPageResultProjectList self = new ListProjectsResponseBodyPageResultProjectList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyPageResultProjectList setDisableDevelopment(Boolean disableDevelopment) {
            this.disableDevelopment = disableDevelopment;
            return this;
        }
        public Boolean getDisableDevelopment() {
            return this.disableDevelopment;
        }

        public ListProjectsResponseBodyPageResultProjectList setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Integer getIsDefault() {
            return this.isDefault;
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

        public ListProjectsResponseBodyPageResultProjectList setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public ListProjectsResponseBodyPageResultProjectList setTablePrivacyMode(Integer tablePrivacyMode) {
            this.tablePrivacyMode = tablePrivacyMode;
            return this;
        }
        public Integer getTablePrivacyMode() {
            return this.tablePrivacyMode;
        }

        public ListProjectsResponseBodyPageResultProjectList setTags(java.util.List<ListProjectsResponseBodyPageResultProjectListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyPageResultProjectListTags> getTags() {
            return this.tags;
        }

        public ListProjectsResponseBodyPageResultProjectList setUseProxyOdpsAccount(Boolean useProxyOdpsAccount) {
            this.useProxyOdpsAccount = useProxyOdpsAccount;
            return this;
        }
        public Boolean getUseProxyOdpsAccount() {
            return this.useProxyOdpsAccount;
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
