// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetProjectResponseBodyData data;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
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

    public GetProjectResponseBody setData(GetProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectResponseBodyData getData() {
        return this.data;
    }

    public static class GetProjectResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("MaxFlowNode")
        public Integer maxFlowNode;

        @NameInMap("ProjectId")
        public Integer projectId;

        @NameInMap("IsAllowDownload")
        public Integer isAllowDownload;

        @NameInMap("ProjectMode")
        public Integer projectMode;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ProdStorageQuota")
        public String prodStorageQuota;

        @NameInMap("ProjectDescription")
        public String projectDescription;

        @NameInMap("DevelopmentType")
        public Integer developmentType;

        @NameInMap("TablePrivacyMode")
        public Integer tablePrivacyMode;

        @NameInMap("DefaultDiResourceGroupIdentifier")
        public String defaultDiResourceGroupIdentifier;

        @NameInMap("SchedulerMaxRetryTimes")
        public Integer schedulerMaxRetryTimes;

        @NameInMap("ProtectedMode")
        public Integer protectedMode;

        @NameInMap("SchedulerRetryInterval")
        public Integer schedulerRetryInterval;

        @NameInMap("Appkey")
        public String appkey;

        @NameInMap("DevStorageQuota")
        public String devStorageQuota;

        @NameInMap("ResidentArea")
        public String residentArea;

        @NameInMap("IsDefault")
        public Integer isDefault;

        @NameInMap("Destination")
        public Integer destination;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectIdentifier")
        public String projectIdentifier;

        @NameInMap("DisableDevelopment")
        public Boolean disableDevelopment;

        @NameInMap("ProjectOwnerBaseId")
        public String projectOwnerBaseId;

        @NameInMap("BaseProject")
        public Boolean baseProject;

        @NameInMap("UseProxyOdpsAccount")
        public Boolean useProxyOdpsAccount;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("EnvTypes")
        public java.util.List<String> envTypes;

        public static GetProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyData self = new GetProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetProjectResponseBodyData setMaxFlowNode(Integer maxFlowNode) {
            this.maxFlowNode = maxFlowNode;
            return this;
        }
        public Integer getMaxFlowNode() {
            return this.maxFlowNode;
        }

        public GetProjectResponseBodyData setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public GetProjectResponseBodyData setIsAllowDownload(Integer isAllowDownload) {
            this.isAllowDownload = isAllowDownload;
            return this;
        }
        public Integer getIsAllowDownload() {
            return this.isAllowDownload;
        }

        public GetProjectResponseBodyData setProjectMode(Integer projectMode) {
            this.projectMode = projectMode;
            return this;
        }
        public Integer getProjectMode() {
            return this.projectMode;
        }

        public GetProjectResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
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

        public GetProjectResponseBodyData setDevelopmentType(Integer developmentType) {
            this.developmentType = developmentType;
            return this;
        }
        public Integer getDevelopmentType() {
            return this.developmentType;
        }

        public GetProjectResponseBodyData setTablePrivacyMode(Integer tablePrivacyMode) {
            this.tablePrivacyMode = tablePrivacyMode;
            return this;
        }
        public Integer getTablePrivacyMode() {
            return this.tablePrivacyMode;
        }

        public GetProjectResponseBodyData setDefaultDiResourceGroupIdentifier(String defaultDiResourceGroupIdentifier) {
            this.defaultDiResourceGroupIdentifier = defaultDiResourceGroupIdentifier;
            return this;
        }
        public String getDefaultDiResourceGroupIdentifier() {
            return this.defaultDiResourceGroupIdentifier;
        }

        public GetProjectResponseBodyData setSchedulerMaxRetryTimes(Integer schedulerMaxRetryTimes) {
            this.schedulerMaxRetryTimes = schedulerMaxRetryTimes;
            return this;
        }
        public Integer getSchedulerMaxRetryTimes() {
            return this.schedulerMaxRetryTimes;
        }

        public GetProjectResponseBodyData setProtectedMode(Integer protectedMode) {
            this.protectedMode = protectedMode;
            return this;
        }
        public Integer getProtectedMode() {
            return this.protectedMode;
        }

        public GetProjectResponseBodyData setSchedulerRetryInterval(Integer schedulerRetryInterval) {
            this.schedulerRetryInterval = schedulerRetryInterval;
            return this;
        }
        public Integer getSchedulerRetryInterval() {
            return this.schedulerRetryInterval;
        }

        public GetProjectResponseBodyData setAppkey(String appkey) {
            this.appkey = appkey;
            return this;
        }
        public String getAppkey() {
            return this.appkey;
        }

        public GetProjectResponseBodyData setDevStorageQuota(String devStorageQuota) {
            this.devStorageQuota = devStorageQuota;
            return this;
        }
        public String getDevStorageQuota() {
            return this.devStorageQuota;
        }

        public GetProjectResponseBodyData setResidentArea(String residentArea) {
            this.residentArea = residentArea;
            return this;
        }
        public String getResidentArea() {
            return this.residentArea;
        }

        public GetProjectResponseBodyData setIsDefault(Integer isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Integer getIsDefault() {
            return this.isDefault;
        }

        public GetProjectResponseBodyData setDestination(Integer destination) {
            this.destination = destination;
            return this;
        }
        public Integer getDestination() {
            return this.destination;
        }

        public GetProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetProjectResponseBodyData setProjectIdentifier(String projectIdentifier) {
            this.projectIdentifier = projectIdentifier;
            return this;
        }
        public String getProjectIdentifier() {
            return this.projectIdentifier;
        }

        public GetProjectResponseBodyData setDisableDevelopment(Boolean disableDevelopment) {
            this.disableDevelopment = disableDevelopment;
            return this;
        }
        public Boolean getDisableDevelopment() {
            return this.disableDevelopment;
        }

        public GetProjectResponseBodyData setProjectOwnerBaseId(String projectOwnerBaseId) {
            this.projectOwnerBaseId = projectOwnerBaseId;
            return this;
        }
        public String getProjectOwnerBaseId() {
            return this.projectOwnerBaseId;
        }

        public GetProjectResponseBodyData setBaseProject(Boolean baseProject) {
            this.baseProject = baseProject;
            return this;
        }
        public Boolean getBaseProject() {
            return this.baseProject;
        }

        public GetProjectResponseBodyData setUseProxyOdpsAccount(Boolean useProxyOdpsAccount) {
            this.useProxyOdpsAccount = useProxyOdpsAccount;
            return this;
        }
        public Boolean getUseProxyOdpsAccount() {
            return this.useProxyOdpsAccount;
        }

        public GetProjectResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetProjectResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public GetProjectResponseBodyData setEnvTypes(java.util.List<String> envTypes) {
            this.envTypes = envTypes;
            return this;
        }
        public java.util.List<String> getEnvTypes() {
            return this.envTypes;
        }

    }

}
