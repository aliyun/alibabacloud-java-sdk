// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Service extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("AppConfig")
    public String appConfig;

    @NameInMap("AppSpecName")
    public String appSpecName;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("AppVersion")
    public String appVersion;

    @NameInMap("CallerUid")
    public String callerUid;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CurrentVersion")
    public Integer currentVersion;

    @NameInMap("ExtraData")
    public String extraData;

    @NameInMap("Gpu")
    public Integer gpu;

    @NameInMap("Image")
    public String image;

    @NameInMap("InternetEndpoint")
    public String internetEndpoint;

    @NameInMap("IntranetEndpoint")
    public String intranetEndpoint;

    @NameInMap("Labels")
    public java.util.List<ServiceLabels> labels;

    @NameInMap("LatestVersion")
    public Integer latestVersion;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("Message")
    public String message;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("ParentUid")
    public String parentUid;

    @NameInMap("PendingInstance")
    public Integer pendingInstance;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("Region")
    public String region;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("ResourceAlias")
    public String resourceAlias;

    @NameInMap("Role")
    public String role;

    @NameInMap("RoleAttrs")
    public String roleAttrs;

    @NameInMap("RunningInstance")
    public Integer runningInstance;

    @NameInMap("SafetyLock")
    public String safetyLock;

    @NameInMap("SecondaryInternetEndpoint")
    public String secondaryInternetEndpoint;

    @NameInMap("SecondaryIntranetEndpoint")
    public String secondaryIntranetEndpoint;

    @NameInMap("ServiceConfig")
    public String serviceConfig;

    @NameInMap("ServiceGroup")
    public String serviceGroup;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceUid")
    public String serviceUid;

    @NameInMap("Source")
    public String source;

    @NameInMap("Status")
    public String status;

    @NameInMap("TotalInstance")
    public Integer totalInstance;

    @NameInMap("UpdateTime")
    public String updateTime;

    @NameInMap("Weight")
    public Integer weight;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Service build(java.util.Map<String, ?> map) throws Exception {
        Service self = new Service();
        return TeaModel.build(map, self);
    }

    public Service setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public Service setAppConfig(String appConfig) {
        this.appConfig = appConfig;
        return this;
    }
    public String getAppConfig() {
        return this.appConfig;
    }

    public Service setAppSpecName(String appSpecName) {
        this.appSpecName = appSpecName;
        return this;
    }
    public String getAppSpecName() {
        return this.appSpecName;
    }

    public Service setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public Service setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

    public Service setCallerUid(String callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public String getCallerUid() {
        return this.callerUid;
    }

    public Service setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public Service setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Service setCurrentVersion(Integer currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }
    public Integer getCurrentVersion() {
        return this.currentVersion;
    }

    public Service setExtraData(String extraData) {
        this.extraData = extraData;
        return this;
    }
    public String getExtraData() {
        return this.extraData;
    }

    public Service setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public Service setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public Service setInternetEndpoint(String internetEndpoint) {
        this.internetEndpoint = internetEndpoint;
        return this;
    }
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    public Service setIntranetEndpoint(String intranetEndpoint) {
        this.intranetEndpoint = intranetEndpoint;
        return this;
    }
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    public Service setLabels(java.util.List<ServiceLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ServiceLabels> getLabels() {
        return this.labels;
    }

    public Service setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }
    public Integer getLatestVersion() {
        return this.latestVersion;
    }

    public Service setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public Service setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Service setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Service setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

    public Service setPendingInstance(Integer pendingInstance) {
        this.pendingInstance = pendingInstance;
        return this;
    }
    public Integer getPendingInstance() {
        return this.pendingInstance;
    }

    public Service setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public Service setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public Service setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Service setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public Service setResourceAlias(String resourceAlias) {
        this.resourceAlias = resourceAlias;
        return this;
    }
    public String getResourceAlias() {
        return this.resourceAlias;
    }

    public Service setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public Service setRoleAttrs(String roleAttrs) {
        this.roleAttrs = roleAttrs;
        return this;
    }
    public String getRoleAttrs() {
        return this.roleAttrs;
    }

    public Service setRunningInstance(Integer runningInstance) {
        this.runningInstance = runningInstance;
        return this;
    }
    public Integer getRunningInstance() {
        return this.runningInstance;
    }

    public Service setSafetyLock(String safetyLock) {
        this.safetyLock = safetyLock;
        return this;
    }
    public String getSafetyLock() {
        return this.safetyLock;
    }

    public Service setSecondaryInternetEndpoint(String secondaryInternetEndpoint) {
        this.secondaryInternetEndpoint = secondaryInternetEndpoint;
        return this;
    }
    public String getSecondaryInternetEndpoint() {
        return this.secondaryInternetEndpoint;
    }

    public Service setSecondaryIntranetEndpoint(String secondaryIntranetEndpoint) {
        this.secondaryIntranetEndpoint = secondaryIntranetEndpoint;
        return this;
    }
    public String getSecondaryIntranetEndpoint() {
        return this.secondaryIntranetEndpoint;
    }

    public Service setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
    }

    public Service setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
        return this;
    }
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    public Service setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public Service setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public Service setServiceUid(String serviceUid) {
        this.serviceUid = serviceUid;
        return this;
    }
    public String getServiceUid() {
        return this.serviceUid;
    }

    public Service setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public Service setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Service setTotalInstance(Integer totalInstance) {
        this.totalInstance = totalInstance;
        return this;
    }
    public Integer getTotalInstance() {
        return this.totalInstance;
    }

    public Service setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public Service setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public Service setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ServiceLabels extends TeaModel {
        @NameInMap("LabelKey")
        public String labelKey;

        @NameInMap("LabelValue")
        public String labelValue;

        public static ServiceLabels build(java.util.Map<String, ?> map) throws Exception {
            ServiceLabels self = new ServiceLabels();
            return TeaModel.build(map, self);
        }

        public ServiceLabels setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public ServiceLabels setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

}
