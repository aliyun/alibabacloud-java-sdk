// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateApplicationBaseInfoResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Applcation")
    public UpdateApplicationBaseInfoResponseBodyApplcation applcation;

    @NameInMap("Code")
    public Integer code;

    public static UpdateApplicationBaseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationBaseInfoResponseBody self = new UpdateApplicationBaseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationBaseInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateApplicationBaseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApplicationBaseInfoResponseBody setApplcation(UpdateApplicationBaseInfoResponseBodyApplcation applcation) {
        this.applcation = applcation;
        return this;
    }
    public UpdateApplicationBaseInfoResponseBodyApplcation getApplcation() {
        return this.applcation;
    }

    public UpdateApplicationBaseInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class UpdateApplicationBaseInfoResponseBodyApplcation extends TeaModel {
        @NameInMap("ExtSlbIp")
        public String extSlbIp;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("SlbPort")
        public Integer slbPort;

        @NameInMap("ExtSlbName")
        public String extSlbName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("Dockerize")
        public Boolean dockerize;

        @NameInMap("Description")
        public String description;

        @NameInMap("InstanceCount")
        public Integer instanceCount;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("Memory")
        public Integer memory;

        @NameInMap("Name")
        public String name;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("HealthCheckUrl")
        public String healthCheckUrl;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("ExtSlbId")
        public String extSlbId;

        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("SlbName")
        public String slbName;

        public static UpdateApplicationBaseInfoResponseBodyApplcation build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationBaseInfoResponseBodyApplcation self = new UpdateApplicationBaseInfoResponseBodyApplcation();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setExtSlbIp(String extSlbIp) {
            this.extSlbIp = extSlbIp;
            return this;
        }
        public String getExtSlbIp() {
            return this.extSlbIp;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbPort(Integer slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public Integer getSlbPort() {
            return this.slbPort;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setExtSlbName(String extSlbName) {
            this.extSlbName = extSlbName;
            return this;
        }
        public String getExtSlbName() {
            return this.extSlbName;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setInstanceCount(Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setHealthCheckUrl(String healthCheckUrl) {
            this.healthCheckUrl = healthCheckUrl;
            return this;
        }
        public String getHealthCheckUrl() {
            return this.healthCheckUrl;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setExtSlbId(String extSlbId) {
            this.extSlbId = extSlbId;
            return this;
        }
        public String getExtSlbId() {
            return this.extSlbId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setBuildPackageId(Long buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public UpdateApplicationBaseInfoResponseBodyApplcation setSlbName(String slbName) {
            this.slbName = slbName;
            return this;
        }
        public String getSlbName() {
            return this.slbName;
        }

    }

}
