// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetProjectDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("DefaultDiResourceGroupIdentifier")
        public String defaultDiResourceGroupIdentifier;

        @NameInMap("DevelopmentType")
        public Integer developmentType;

        @NameInMap("DisableDevelopment")
        public Boolean disableDevelopment;

        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("IsAllowDownload")
        public Integer isAllowDownload;

        @NameInMap("IsDefault")
        public Integer isDefault;

        @NameInMap("ProjectDescription")
        public String projectDescription;

        @NameInMap("ProjectId")
        public Integer projectId;

        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        @NameInMap("ProjectMode")
        public Integer projectMode;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        @NameInMap("ProtectedMode")
        public Integer protectedMode;

        @NameInMap("ResidentArea")
        public String residentArea;

        @NameInMap("ResourceManagerResourceGroupId")
        public String resourceManagerResourceGroupId;

        @NameInMap("SchedulerMaxRetryTimes")
        public Integer schedulerMaxRetryTimes;

        @NameInMap("SchedulerRetryInterval")
        public Integer schedulerRetryInterval;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TablePrivacyMode")
        public Integer tablePrivacyMode;

        @NameInMap("Tags")
        public java.util.List<GetProjectDetailResponseBodyDataTags> tags;

        @NameInMap("TenantId")
        public Long tenantId;

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
