// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Service extends TeaModel {
    // 服务创建账号的UID
    @NameInMap("CallerUid")
    public String callerUid;

    // 每个实例申请的cpu
    @NameInMap("Cpu")
    public Integer cpu;

    // 服务的创建时间
    @NameInMap("CreateTime")
    public String createTime;

    // 当前运行的模型版本
    @NameInMap("CurrentVersion")
    public Integer currentVersion;

    // 每个实例申请的gpu
    @NameInMap("Gpu")
    public Integer gpu;

    // 服务的数据镜像
    @NameInMap("Image")
    public String image;

    // 服务的公网endpoint
    @NameInMap("InternetEndpoint")
    public String internetEndpoint;

    // 服务内网endpoint
    @NameInMap("IntranetEndpoint")
    public String intranetEndpoint;

    // 服务最新版本号
    @NameInMap("LatestVersion")
    public Integer latestVersion;

    // 每个worker需要的内存大小，单位为M
    @NameInMap("Memory")
    public Integer memory;

    // 服务的摘要信息
    @NameInMap("Message")
    public String message;

    // 服务所在的命名空间
    @NameInMap("Namespace")
    public String namespace;

    // 服务创建账号的主账号UID
    @NameInMap("ParentUid")
    public String parentUid;

    // 被挂起的服务的实例个数
    @NameInMap("PendingInstance")
    public Integer pendingInstance;

    // 服务的状态信息
    @NameInMap("Reason")
    public String reason;

    // 服务所在的区域
    @NameInMap("Region")
    public String region;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 服务所在的资源组
    @NameInMap("Resource")
    public String resource;

    // 正在运行的服务的实例个数
    @NameInMap("RunningInstance")
    public Integer runningInstance;

    // 服务的配置信息
    @NameInMap("ServiceConfig")
    public String serviceConfig;

    // 服务的名字
    @NameInMap("ServiceName")
    public String serviceName;

    // 服务ID
    @NameInMap("ServiceUid")
    public String serviceUid;

    // 服务的状态
    @NameInMap("Status")
    public String status;

    // 服务的所有实例总个数
    @NameInMap("TotalInstance")
    public Integer totalInstance;

    // 服务的更新时间
    @NameInMap("Updatetime")
    public String updatetime;

    // 服务灰度发布的权重值
    @NameInMap("Weight")
    public Integer weight;

    public static Service build(java.util.Map<String, ?> map) throws Exception {
        Service self = new Service();
        return TeaModel.build(map, self);
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

    public Service setRunningInstance(Integer runningInstance) {
        this.runningInstance = runningInstance;
        return this;
    }
    public Integer getRunningInstance() {
        return this.runningInstance;
    }

    public Service setServiceConfig(String serviceConfig) {
        this.serviceConfig = serviceConfig;
        return this;
    }
    public String getServiceConfig() {
        return this.serviceConfig;
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

    public Service setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
        return this;
    }
    public String getUpdatetime() {
        return this.updatetime;
    }

    public Service setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
