// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("Data")
    public GetProjectResponseBodyData data;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The description of the workspace.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the workspace. Valid values:</p>
     * <br>
     * <p>*   AVAILABLE(0): The workspace is in a normal state.</p>
     * <p>*   DELETED(1): The workspace is deleted.</p>
     * <p>*   INITIALIZING(2): The workspace is being initialized.</p>
     * <p>*   INIT_FAILED(3): The workspace fails to be initialized.</p>
     * <p>*   FORBIDDEN(4): The workspace is manually disabled.</p>
     * <p>*   DELETING(5): The workspace is being deleted.</p>
     * <p>*   DEL_FAILED(6): The workspace fails to be deleted.</p>
     * <p>*   FROZEN(7): The workspace is frozen due to overdue payments.</p>
     * <p>*   UPDATING(8): The workspace is being updated. The workspace enters this state after you associate a new compute engine with the workspace and the compute engine is being initialized.</p>
     * <p>*   UPDATE_FAILED(9): The workspace fails to be updated.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setData(GetProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectResponseBodyData getData() {
        return this.data;
    }

    public GetProjectResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectResponseBodyDataTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetProjectResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyDataTags self = new GetProjectResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetProjectResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetProjectResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the workspace is a default workspace. Valid values:</p>
         * <br>
         * <p>*   1: The workspace is a default workspace.</p>
         * <p>*   0: The workspace is not a default workspace.</p>
         */
        @NameInMap("Appkey")
        public String appkey;

        /**
         * <p>The time when the workspace was created. Example: Dec 3, 2019 9:12:20 PM.</p>
         */
        @NameInMap("BaseProject")
        public Boolean baseProject;

        @NameInMap("DefaultDiResourceGroupIdentifier")
        public String defaultDiResourceGroupIdentifier;

        /**
         * <p>The unique identifier of the workspace.</p>
         */
        @NameInMap("Destination")
        public Integer destination;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("DevStorageQuota")
        public String devStorageQuota;

        /**
         * <p>The default maximum number of automatic reruns that are allowed after an error occurs.</p>
         */
        @NameInMap("DevelopmentType")
        public Integer developmentType;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("DisableDevelopment")
        public Boolean disableDevelopment;

        /**
         * <p>The list of tags.</p>
         * <br>
         * <p>The tags are added to resources in the workspace and used for authentication and cost allocation.</p>
         */
        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        /**
         * <p>The environment of the workspace. Valid values: PROD and DEV.</p>
         * <br>
         * <p>*   The value PROD indicates the production environment. Workspaces in basic mode provide only the production environment.</p>
         * <p>*   The value DEV indicates the development environment. Workspaces in standard mode provide both the development environment and the production environment.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The description of the workspace.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The time when the workspace was last modified. Example: Dec 3, 2019 9:12:20 PM.</p>
         */
        @NameInMap("IsAllowDownload")
        public Integer isAllowDownload;

        /**
         * <p>The display name of the workspace.</p>
         */
        @NameInMap("IsDefault")
        public Integer isDefault;

        /**
         * <p>Indicates whether you are allowed to download the query result from DataStudio. Valid values:</p>
         * <br>
         * <p>*   1: You are allowed to download the query result from DataStudio.</p>
         * <p>*   0: You are not allowed to download the query result from DataStudio.</p>
         */
        @NameInMap("MaxFlowNode")
        public Integer maxFlowNode;

        /**
         * <p>The development type of the workspace. The value is fixed as 4. This parameter is deprecated.</p>
         */
        @NameInMap("ProdStorageQuota")
        public String prodStorageQuota;

        /**
         * <p>Indicates whether the MaxCompute tables in the workspace are visible to the users within a tenant. Valid values:</p>
         * <br>
         * <p>*   0: The MaxCompute tables are invisible to the users within a tenant.</p>
         * <p>*   1: The MaxCompute tables are visible to the users within a tenant.</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <p>The mode of the workspace. Valid values:</p>
         * <br>
         * <p>*   2: The workspace is in basic mode.</p>
         * <p>*   3: The workspace is in standard mode.</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The ID of the Alibaba Cloud account used by the workspace owner.</p>
         */
        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("ProjectMode")
        public Integer projectMode;

        /**
         * <p>Indicates whether the Development role is disabled. Valid values:</p>
         * <br>
         * <p>*   false: The Development role is enabled.</p>
         * <p>*   true: The Development role is disabled.</p>
         * <br>
         * <p><!----></p>
         * <br>
         * <p>*   Default value: false.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Indicates whether a proxy account is used to access the MaxCompute compute engine instance associated with the workspace.</p>
         */
        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("ProtectedMode")
        public Integer protectedMode;

        @NameInMap("ResidentArea")
        public String residentArea;

        /**
         * <p>The keys of the tags that are added to resources in the workspace. The tag keys must meet the following conditions:</p>
         * <br>
         * <p>*   The number of tag keys that can be added to resources ranges from 1 to 20.</p>
         * <p>*   Each tag key can be a maximum of 128 characters in length.</p>
         * <p>*   The tag keys cannot start with acs: or aliyun:.</p>
         * <p>*   The tag keys cannot contain http:// or https://.</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The interval between automatic reruns after an error occurs. Unit: milliseconds. The maximum interval is 30 minutes. You must pay attention to the conversion between units.</p>
         */
        @NameInMap("SchedulerMaxRetryTimes")
        public Integer schedulerMaxRetryTimes;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("SchedulerRetryInterval")
        public Integer schedulerRetryInterval;

        /**
         * <p>The ID of the workspace.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether the workspace protection feature is enabled. Valid values:</p>
         * <br>
         * <p>*   1: The workspace protection feature is enabled.</p>
         * <p>*   0: The workspace protection feature is disabled.</p>
         */
        @NameInMap("TablePrivacyMode")
        public Integer tablePrivacyMode;

        /**
         * <p>The values of the tags that are added to resources in the workspace. The tag values must meet the following conditions:</p>
         * <br>
         * <p>*   The number of tag values that can be added to resources ranges from 1 to 20.</p>
         * <p>*   Each tag value can be a maximum of 128 characters in length.</p>
         * <p>*   The tag values cannot start with acs:.</p>
         * <p>*   The tag values cannot contain http:// or https://.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetProjectResponseBodyDataTags> tags;

        /**
         * <p>The ID of the resource group used in the workspace.</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("UseProxyOdpsAccount")
        public Boolean useProxyOdpsAccount;

        public static GetProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyData self = new GetProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyData setAppkey(String appkey) {
            this.appkey = appkey;
            return this;
        }
        public String getAppkey() {
            return this.appkey;
        }

        public GetProjectResponseBodyData setBaseProject(Boolean baseProject) {
            this.baseProject = baseProject;
            return this;
        }
        public Boolean getBaseProject() {
            return this.baseProject;
        }

        public GetProjectResponseBodyData setDefaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
            this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
            return this;
        }
        public String getDefaultDiResourceGroupIdentifier() {
            return this.defaultDiResourceGroupIdentifier;
        }

        public GetProjectResponseBodyData setDestination(Integer destination) {
            this.destination = destination;
            return this;
        }
        public Integer getDestination() {
            return this.destination;
        }

        public GetProjectResponseBodyData setDevStorageQuota(String devStorageQuota) {
            this.devStorageQuota = devStorageQuota;
            return this;
        }
        public String getDevStorageQuota() {
            return this.devStorageQuota;
        }

        public GetProjectResponseBodyData setDevelopmentType(Integer developmentType) {
            this.developmentType = developmentType;
            return this;
        }
        public Integer getDevelopmentType() {
            return this.developmentType;
        }

        public GetProjectResponseBodyData setDisableDevelopment(Boolean disableDevelopment) {
            this.disableDevelopment = disableDevelopment;
            return this;
        }
        public Boolean getDisableDevelopment() {
            return this.disableDevelopment;
        }

        public GetProjectResponseBodyData setEnvTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }
        public java.util.List<String> getEnvTypes() {
            return this.envTypes;
        }

        public GetProjectResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectResponseBodyData setIsAllowDownload(Integer isAllowDownload) {
            this.isAllowDownload = isAllowDownload;
            return this;
        }
        public Integer getIsAllowDownload() {
            return this.isAllowDownload;
        }

        public GetProjectResponseBodyData setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Integer getIsDefault() {
            return this.isDefault;
        }

        public GetProjectResponseBodyData setMaxFlowNode(Integer maxFlowNode) {
            this.maxFlowNode = maxFlowNode;
            return this;
        }
        public Integer getMaxFlowNode() {
            return this.maxFlowNode;
        }

        public GetProjectResponseBodyData setProdStorageQuota(String prodStorageQuota) {
            this.prodStorageQuota = prodStorageQuota;
            return this;
        }
        public String getProdStorageQuota() {
            return this.prodStorageQuota;
        }

        public GetProjectResponseBodyData setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public GetProjectResponseBodyData setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public GetProjectResponseBodyData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public GetProjectResponseBodyData setProjectMode(Integer projectMode) {
            this.projectMode = projectMode;
            return this;
        }
        public Integer getProjectMode() {
            return this.projectMode;
        }

        public GetProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetProjectResponseBodyData setProjectOwnerBaseId(String projectOwnerBaseId) {
            this.projectOwnerBaseId = projectOwnerBaseId;
            return this;
        }
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        public GetProjectResponseBodyData setProtectedMode(Integer protectedMode) {
            this.protectedMode = protectedMode;
            return this;
        }
        public Integer getProtectedMode() {
            return this.protectedMode;
        }

        public GetProjectResponseBodyData setResidentArea(String residentArea) {
            this.residentArea = residentArea;
            return this;
        }
        public String getResidentArea() {
            return this.residentArea;
        }

        public GetProjectResponseBodyData setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public GetProjectResponseBodyData setSchedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
            this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
            return this;
        }
        public Integer getSchedulerMaxRetryTimes() {
            return this.schedulerMaxRetryTimes;
        }

        public GetProjectResponseBodyData setSchedulerRetryInterval(Integer schedulerRetryInterval) {
            this.schedulerRetryInterval = schedulerRetryInterval;
            return this;
        }
        public Integer getSchedulerRetryInterval() {
            return this.schedulerRetryInterval;
        }

        public GetProjectResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetProjectResponseBodyData setTablePrivacyMode(Integer tablePrivacyMode) {
            this.tablePrivacyMode = tablePrivacyMode;
            return this;
        }
        public Integer getTablePrivacyMode() {
            return this.tablePrivacyMode;
        }

        public GetProjectResponseBodyData setTags(java.util.List<GetProjectResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetProjectResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetProjectResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetProjectResponseBodyData setUseProxyOdpsAccount(Boolean useProxyOdpsAccount) {
            this.useProxyOdpsAccount = useProxyOdpsAccount;
            return this;
        }
        public Boolean getUseProxyOdpsAccount() {
            return this.useProxyOdpsAccount;
        }

    }

}
