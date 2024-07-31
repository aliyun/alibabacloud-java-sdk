// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <p>The results that are returned.</p>
     */
    @NameInMap("PageResult")
    public ListProjectsResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20658801***</p>
     */
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
        /**
         * <p>The key of tag N added to the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N added to the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
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
        /**
         * <p>Indicates whether the Development role is disabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: enabled</li>
         * <li><strong>true</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableDevelopment")
        public Boolean disableDevelopment;

        /**
         * <p>Indicates whether the workspace is a default workspace. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The workspace is a default workspace.</li>
         * <li><strong>0</strong>: The workspace is not a default workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDefault")
        public Integer isDefault;

        /**
         * <p>The description of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_describe</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1212</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        /**
         * <p>The display name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The ID of the user used by the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>122222</p>
         */
        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        /**
         * <p>The status of the workspace. Valid values:</p>
         * <ul>
         * <li>0: AVAILABLE, which indicates that the workspace is running as expected.</li>
         * <li>1: DELETED, which indicates that the workspace is deleted.</li>
         * <li>2: INITIALIZING, which indicates that the workspace is being initialized.</li>
         * <li>3: INIT_FAILED, which indicates that the workspace fails to be initialized.</li>
         * <li>4: FORBIDDEN, which indicates that the workspace is manually disabled.</li>
         * <li>5: DELETING, which indicates that the workspace is being deleted.</li>
         * <li>6: DEL_FAILED, which indicates that the workspace fails to be deleted.</li>
         * <li>7: FROZEN, which indicates that the workspace is frozen due to overdue payments.</li>
         * <li>8: UPDATING, which indicates that the workspace is being updated. After you associate a compute engine with the workspace, the system initializes the compute engine and updates the workspace.</li>
         * <li>9: UPDATE_FAILED, which indicates that the workspace fails to be updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProjectStatus")
        public Integer projectStatus;

        /**
         * <p>The status code of the workspace. Valid values:</p>
         * <ul>
         * <li>AVAILABLE: 0, which indicates that the workspace is running as expected.</li>
         * <li>DELETED: 1, which indicates that the workspace is deleted.</li>
         * <li>INITIALIZING: 2, which indicates that the workspace is being initialized.</li>
         * <li>INIT_FAILED: 3, which indicates that the workspace fails to be initialized.</li>
         * <li>FORBIDDEN: 4, which indicates that the workspace is manually disabled.</li>
         * <li>DELETING: 5, which indicates that the workspace is being deleted.</li>
         * <li>DEL_FAILED: 6, which indicates that the workspace fails to be deleted.</li>
         * <li>FROZEN: 7, which indicates that the workspace is frozen due to overdue payments.</li>
         * <li>UPDATING: 8, which indicates that the workspace is being updated. After you associate a compute engine with the workspace, the system initializes the compute engine and updates the workspace.</li>
         * <li>UPDATE_FAILED: 9, which indicates that the workspace fails to be updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("ProjectStatusCode")
        public String projectStatusCode;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzbn7pti3zfa</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>Indicates whether the MaxCompute tables in the workspace are visible to the users within a tenant. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: invisible</li>
         * <li><strong>1</strong>: visible</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TablePrivacyMode")
        public Integer tablePrivacyMode;

        /**
         * <p>The tags added to the workspace.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListProjectsResponseBodyPageResultProjectListTags> tags;

        /**
         * <p>Indicates whether a proxy account is used to access the MaxCompute compute engine associated with the workspace. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>The page number.</p>
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
         * <p>The DataWorks workspaces.</p>
         */
        @NameInMap("ProjectList")
        public java.util.List<ListProjectsResponseBodyPageResultProjectList> projectList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
