// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The details of the workspace.</p>
     */
    @NameInMap("Data")
    public GetProjectResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
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
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Appkey")
        public String appkey;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BaseProject")
        public Boolean baseProject;

        /**
         * <p>The identifier of the default resource group that is automatically assigned when you purchase a MaxCompute exclusive resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>group_280749521****</p>
         */
        @NameInMap("DefaultDiResourceGroupIdentifier")
        public String defaultDiResourceGroupIdentifier;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Destination")
        public Integer destination;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DevStorageQuota")
        public String devStorageQuota;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DevelopmentType")
        public Integer developmentType;

        /**
         * <p>Indicates whether the development role is disabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default): The development role is enabled.</li>
         * <li><strong>true</strong>: The development role is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableDevelopment")
        public Boolean disableDevelopment;

        /**
         * <p>The environment context of the workspace.</p>
         */
        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        /**
         * <p>The time when the workspace was created. Example: <code>Dec 3, 2019 9:12:20 PM</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Oct 10, 2019 3:42:53 PM</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the workspace was last modified. Example: <code>Dec 3, 2019 9:12:20 PM</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Dec 3, 2019 9:12:20 PM</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether downloading query results from the IDE is allowed. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Downloading is allowed.</li>
         * <li><strong>0</strong>: Downloading is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAllowDownload")
        public Integer isAllowDownload;

        /**
         * <p>Indicates whether the workspace is the default workspace. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Yes.</li>
         * <li><strong>0</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsDefault")
        public Integer isDefault;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxFlowNode")
        public Integer maxFlowNode;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProdStorageQuota")
        public String prodStorageQuota;

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
         * <p>466230</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        /**
         * <p>The mode of the workspace. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: basic mode.</li>
         * <li><strong>3</strong>: standard mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProjectMode")
        public Integer projectMode;

        /**
         * <p>The display name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The Alibaba Cloud ID of the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>18229311****</p>
         */
        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        /**
         * <p>Indicates whether protected mode is enabled for the workspace. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Protected mode is enabled.</li>
         * <li><strong>0</strong>: Protected mode is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtectedMode")
        public Integer protectedMode;

        /**
         * <p>The type of the workspace. Valid values:</p>
         * <ul>
         * <li><strong>private</strong>: private zone.</li>
         * <li><strong>swap</strong>: swap zone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        @NameInMap("ResidentArea")
        public String residentArea;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzbn7****</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The default maximum number of automatic reruns upon an error.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SchedulerMaxRetryTimes")
        public Integer schedulerMaxRetryTimes;

        /**
         * <p>The default interval between automatic reruns upon an error. Unit: ms. The maximum value is 30 minutes. Note the unit conversion.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("SchedulerRetryInterval")
        public Integer schedulerRetryInterval;

        /**
         * <p>The status of the workspace. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: AVAILABLE. The workspace is running normally.</li>
         * <li><strong>1</strong>: DELETED. The workspace has been deleted.</li>
         * <li><strong>2</strong>: INITIALIZING. The workspace is being initialized.</li>
         * <li><strong>3</strong>: INIT_FAILED. The workspace failed to be initialized.</li>
         * <li><strong>4</strong>: FORBIDDEN. The workspace is manually disabled.</li>
         * <li><strong>5</strong>: DELETING. The workspace is being deleted.</li>
         * <li><strong>6</strong>: DEL_FAILED. The workspace failed to be deleted.</li>
         * <li><strong>7</strong>: FROZEN. The workspace is frozen due to overdue payment.</li>
         * <li><strong>8</strong>: UPDATING. The workspace is being updated (a compute engine is being added and initialized).</li>
         * <li><strong>9</strong>: UPDATE_FAILED. The workspace failed to be updated (a compute engine failed to be added and initialized).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The visibility of MaxCompute tables. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: MaxCompute tables are not visible to users within the tenant.</li>
         * <li><strong>1</strong>: MaxCompute tables are visible to users within the tenant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TablePrivacyMode")
        public Integer tablePrivacyMode;

        /**
         * <p>The list of tags bound to the workspace.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetProjectResponseBodyDataTags> tags;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>280749521</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>Indicates whether a proxy account is used to access the MaxCompute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
