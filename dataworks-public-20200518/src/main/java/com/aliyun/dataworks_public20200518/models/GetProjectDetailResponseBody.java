// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectDetailResponseBody extends TeaModel {
    /**
     * <p>The information about the workspace.</p>
     */
    @NameInMap("Data")
    public GetProjectDetailResponseBodyData data;

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
     * <p>0bc1411515937635973****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetProjectDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectDetailResponseBody self = new GetProjectDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectDetailResponseBody setData(GetProjectDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectDetailResponseBodyData getData() {
        return this.data;
    }

    public GetProjectDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetProjectDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetProjectDetailResponseBodyDataTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>Env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetProjectDetailResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDetailResponseBodyDataTags self = new GetProjectDetailResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetProjectDetailResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetProjectDetailResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetProjectDetailResponseBodyData extends TeaModel {
        /**
         * <p>The identifier of the shared resource group for Data Integration on which nodes are run.</p>
         * 
         * <strong>example:</strong>
         * <p>group_280749521****</p>
         */
        @NameInMap("DefaultDiResourceGroupIdentifier")
        public String defaultDiResourceGroupIdentifier;

        /**
         * <p>The development type of the workspace. The value is fixed to 4.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DevelopmentType")
        public Integer developmentType;

        /**
         * <p>Indicates whether the Develop role is disabled. Valid values:</p>
         * <ul>
         * <li><strong>false</strong> (default)</li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisableDevelopment")
        public Boolean disableDevelopment;

        /**
         * <p>The environments of workspaces in different modes. Workspaces in basic mode provide only the production environment. Workspaces in standard mode provide both the development environment and the production environment.</p>
         */
        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        /**
         * <p>The time when the workspace was created.</p>
         * 
         * <strong>example:</strong>
         * <p>Oct 10, 2019 3:42:53 PM</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the workspace was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>Dec 3, 2019 9:12:20 PM</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Indicates whether the download operation is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAllowDownload")
        public Integer isAllowDownload;

        /**
         * <p>Indicates whether the workspace is a default workspace. Valid values:</p>
         * <ul>
         * <li>1: The workspace is a default workspace.</li>
         * <li>0: The workspace is not a default workspace.</li>
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
         * <p>abc</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The unique identifier of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        /**
         * <p>The mode of the workspace. The value 2 indicates that the workspace is in basic mode. The value 3 indicates that the workspace is in standard mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProjectMode")
        public Integer projectMode;

        /**
         * <p>The display name of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The ID of the Alibaba Cloud account used by the workspace owner.</p>
         * 
         * <strong>example:</strong>
         * <p>18229311****</p>
         */
        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        /**
         * <p>Indicates whether the workspace protection feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtectedMode")
        public Integer protectedMode;

        /**
         * <p>The type of the workspace. Valid values: private and swap.</p>
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
         * <p>rg-acfmzbn7pti3zfa</p>
         */
        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        /**
         * <p>The default maximum number of automatic reruns that are allowed after an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SchedulerMaxRetryTimes")
        public Integer schedulerMaxRetryTimes;

        /**
         * <p>The interval between automatic reruns after an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>120000</p>
         */
        @NameInMap("SchedulerRetryInterval")
        public Integer schedulerRetryInterval;

        /**
         * <p>The status of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>Indicates whether the MaxCompute tables in the workspace are visible to the users within a tenant. Valid values:</p>
         * <ul>
         * <li>0: The MaxCompute tables in the workspace are not visible to the users within a tenant.</li>
         * <li>1: The MaxCompute tables in the workspace are visible to the users within a tenant.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TablePrivacyMode")
        public Integer tablePrivacyMode;

        /**
         * <p>The tag information.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetProjectDetailResponseBodyDataTags> tags;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>280749521950784</p>
         */
        @NameInMap("TenantId")
        public Long tenantId;

        /**
         * <p>Indicates whether a proxy account is used to access the MaxCompute compute engine.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseProxyOdpsAccount")
        public Boolean useProxyOdpsAccount;

        public static GetProjectDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectDetailResponseBodyData self = new GetProjectDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectDetailResponseBodyData setDefaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
            this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
            return this;
        }
        public String getDefaultDiResourceGroupIdentifier() {
            return this.defaultDiResourceGroupIdentifier;
        }

        public GetProjectDetailResponseBodyData setDevelopmentType(Integer developmentType) {
            this.developmentType = developmentType;
            return this;
        }
        public Integer getDevelopmentType() {
            return this.developmentType;
        }

        public GetProjectDetailResponseBodyData setDisableDevelopment(Boolean disableDevelopment) {
            this.disableDevelopment = disableDevelopment;
            return this;
        }
        public Boolean getDisableDevelopment() {
            return this.disableDevelopment;
        }

        public GetProjectDetailResponseBodyData setEnvTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }
        public java.util.List<String> getEnvTypes() {
            return this.envTypes;
        }

        public GetProjectDetailResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectDetailResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetProjectDetailResponseBodyData setIsAllowDownload(Integer isAllowDownload) {
            this.isAllowDownload = isAllowDownload;
            return this;
        }
        public Integer getIsAllowDownload() {
            return this.isAllowDownload;
        }

        public GetProjectDetailResponseBodyData setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Integer getIsDefault() {
            return this.isDefault;
        }

        public GetProjectDetailResponseBodyData setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public GetProjectDetailResponseBodyData setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public GetProjectDetailResponseBodyData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public GetProjectDetailResponseBodyData setProjectMode(Integer projectMode) {
            this.projectMode = projectMode;
            return this;
        }
        public Integer getProjectMode() {
            return this.projectMode;
        }

        public GetProjectDetailResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetProjectDetailResponseBodyData setProjectOwnerBaseId(String projectOwnerBaseId) {
            this.projectOwnerBaseId = projectOwnerBaseId;
            return this;
        }
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        public GetProjectDetailResponseBodyData setProtectedMode(Integer protectedMode) {
            this.protectedMode = protectedMode;
            return this;
        }
        public Integer getProtectedMode() {
            return this.protectedMode;
        }

        public GetProjectDetailResponseBodyData setResidentArea(String residentArea) {
            this.residentArea = residentArea;
            return this;
        }
        public String getResidentArea() {
            return this.residentArea;
        }

        public GetProjectDetailResponseBodyData setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }
        public String getResourceManagerResourceGroupId() {
            return this.resourceManagerResourceGroupId;
        }

        public GetProjectDetailResponseBodyData setSchedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
            this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
            return this;
        }
        public Integer getSchedulerMaxRetryTimes() {
            return this.schedulerMaxRetryTimes;
        }

        public GetProjectDetailResponseBodyData setSchedulerRetryInterval(Integer schedulerRetryInterval) {
            this.schedulerRetryInterval = schedulerRetryInterval;
            return this;
        }
        public Integer getSchedulerRetryInterval() {
            return this.schedulerRetryInterval;
        }

        public GetProjectDetailResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetProjectDetailResponseBodyData setTablePrivacyMode(Integer tablePrivacyMode) {
            this.tablePrivacyMode = tablePrivacyMode;
            return this;
        }
        public Integer getTablePrivacyMode() {
            return this.tablePrivacyMode;
        }

        public GetProjectDetailResponseBodyData setTags(java.util.List<GetProjectDetailResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetProjectDetailResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetProjectDetailResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetProjectDetailResponseBodyData setUseProxyOdpsAccount(Boolean useProxyOdpsAccount) {
            this.useProxyOdpsAccount = useProxyOdpsAccount;
            return this;
        }
        public Boolean getUseProxyOdpsAccount() {
            return this.useProxyOdpsAccount;
        }

    }

}
