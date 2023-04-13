// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceResponseBody self = new GetInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetInstanceResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInstanceResponseBody setInstance(GetInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public GetInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public GetInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInstanceResponseBodyInstanceEndpoints extends TeaModel {
        @NameInMap("AlternativeEndpoints")
        public String alternativeEndpoints;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Endpoint")
        public String endpoint;

        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcInstanceId")
        public String vpcInstanceId;

        public static GetInstanceResponseBodyInstanceEndpoints build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceEndpoints self = new GetInstanceResponseBodyInstanceEndpoints();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceEndpoints setAlternativeEndpoints(String alternativeEndpoints) {
            this.alternativeEndpoints = alternativeEndpoints;
            return this;
        }
        public String getAlternativeEndpoints() {
            return this.alternativeEndpoints;
        }

        public GetInstanceResponseBodyInstanceEndpoints setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetInstanceResponseBodyInstanceEndpoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetInstanceResponseBodyInstanceEndpoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetInstanceResponseBodyInstanceEndpoints setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetInstanceResponseBodyInstanceEndpoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetInstanceResponseBodyInstanceEndpoints setVpcInstanceId(String vpcInstanceId) {
            this.vpcInstanceId = vpcInstanceId;
            return this;
        }
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

    }

    public static class GetInstanceResponseBodyInstanceTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static GetInstanceResponseBodyInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstanceTags self = new GetInstanceResponseBodyInstanceTags();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstanceTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetInstanceResponseBodyInstanceTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("AutoRenewal")
        public String autoRenewal;

        @NameInMap("ColdStorage")
        public Long coldStorage;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("ComputeNodeCount")
        public Long computeNodeCount;

        @NameInMap("Cpu")
        public Long cpu;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Disk")
        public String disk;

        @NameInMap("EnableHiveAccess")
        public String enableHiveAccess;

        @NameInMap("Endpoints")
        public java.util.List<GetInstanceResponseBodyInstanceEndpoints> endpoints;

        @NameInMap("ExpirationTime")
        public String expirationTime;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceOwner")
        public String instanceOwner;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LeaderInstanceId")
        public String leaderInstanceId;

        @NameInMap("Memory")
        public Long memory;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("SuspendReason")
        public String suspendReason;

        @NameInMap("Tags")
        public java.util.List<GetInstanceResponseBodyInstanceTags> tags;

        @NameInMap("Version")
        public String version;

        @NameInMap("ZoneId")
        public String zoneId;

        public static GetInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceResponseBodyInstance self = new GetInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public GetInstanceResponseBodyInstance setAutoRenewal(String autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public String getAutoRenewal() {
            return this.autoRenewal;
        }

        public GetInstanceResponseBodyInstance setColdStorage(Long coldStorage) {
            this.coldStorage = coldStorage;
            return this;
        }
        public Long getColdStorage() {
            return this.coldStorage;
        }

        public GetInstanceResponseBodyInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetInstanceResponseBodyInstance setComputeNodeCount(Long computeNodeCount) {
            this.computeNodeCount = computeNodeCount;
            return this;
        }
        public Long getComputeNodeCount() {
            return this.computeNodeCount;
        }

        public GetInstanceResponseBodyInstance setCpu(Long cpu) {
            this.cpu = cpu;
            return this;
        }
        public Long getCpu() {
            return this.cpu;
        }

        public GetInstanceResponseBodyInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetInstanceResponseBodyInstance setDisk(String disk) {
            this.disk = disk;
            return this;
        }
        public String getDisk() {
            return this.disk;
        }

        public GetInstanceResponseBodyInstance setEnableHiveAccess(String enableHiveAccess) {
            this.enableHiveAccess = enableHiveAccess;
            return this;
        }
        public String getEnableHiveAccess() {
            return this.enableHiveAccess;
        }

        public GetInstanceResponseBodyInstance setEndpoints(java.util.List<GetInstanceResponseBodyInstanceEndpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyInstanceEndpoints> getEndpoints() {
            return this.endpoints;
        }

        public GetInstanceResponseBodyInstance setExpirationTime(String expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public String getExpirationTime() {
            return this.expirationTime;
        }

        public GetInstanceResponseBodyInstance setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public GetInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public GetInstanceResponseBodyInstance setInstanceOwner(String instanceOwner) {
            this.instanceOwner = instanceOwner;
            return this;
        }
        public String getInstanceOwner() {
            return this.instanceOwner;
        }

        public GetInstanceResponseBodyInstance setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetInstanceResponseBodyInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public GetInstanceResponseBodyInstance setLeaderInstanceId(String leaderInstanceId) {
            this.leaderInstanceId = leaderInstanceId;
            return this;
        }
        public String getLeaderInstanceId() {
            return this.leaderInstanceId;
        }

        public GetInstanceResponseBodyInstance setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public GetInstanceResponseBodyInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceResponseBodyInstance setSuspendReason(String suspendReason) {
            this.suspendReason = suspendReason;
            return this;
        }
        public String getSuspendReason() {
            return this.suspendReason;
        }

        public GetInstanceResponseBodyInstance setTags(java.util.List<GetInstanceResponseBodyInstanceTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetInstanceResponseBodyInstanceTags> getTags() {
            return this.tags;
        }

        public GetInstanceResponseBodyInstance setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetInstanceResponseBodyInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
