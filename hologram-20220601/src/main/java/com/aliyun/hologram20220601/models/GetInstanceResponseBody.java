// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The instance details.</p>
     */
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>865A02C2-B374-5DD4-9B34-0CA15DA1AEBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request, which indicates whether an exception occurred. This parameter is not related to the business logic.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Some earlier instances have both AnyTunnel and SingleTunnel enabled. When you switch from AnyTunnel to SingleTunnel, the endpoints for both are retained. This field is used to store the extra endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-uqm362o1b001-cn-hangzhou-internal.hologres.aliyuncs.com:80</p>
         */
        @NameInMap("AlternativeEndpoints")
        public String alternativeEndpoints;

        /**
         * <p>Indicates whether the network is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The domain name of the endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-uqm362o1b001-cn-hangzhou-internal.hologres.aliyuncs.com:80</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1jqwp2ys6kp7tc9t983</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf66jjber3hgvwhki3wna</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The VPC instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-uqm362o1b001-frontend-st</p>
         */
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
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
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
        /**
         * <p>Indicates whether auto-renewal is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenewal")
        public String autoRenewal;

        /**
         * <p>The cold storage capacity. Unit: GB. SSD is hot storage, which is also standard storage. HDD is cold storage.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("ColdStorage")
        public Long coldStorage;

        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>hologram_combo_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The number of compute nodes. A node has 16 vCPUs and 32 GB of memory.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ComputeNodeCount")
        public Long computeNodeCount;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-03T13:06:06Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The size of the standard storage. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Disk")
        public String disk;

        /**
         * <p>Indicates whether data lake acceleration is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableHiveAccess")
        public String enableHiveAccess;

        /**
         * <p>Indicates whether SSL is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSSL")
        public Boolean enableSSL;

        /**
         * <p>Indicates whether Serverless Computing is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableServerless")
        public Boolean enableServerless;

        /**
         * <p>The list of endpoints.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<GetInstanceResponseBodyInstanceEndpoints> endpoints;

        /**
         * <p>The expiration time. Pay-as-you-go instances do not expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-02-03T13:06:06Z</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>The number of gateway nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("GatewayCount")
        public Long gatewayCount;

        /**
         * <p>The vCPU resources of the gateway. Unit: cores.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("GatewayCpu")
        public Long gatewayCpu;

        /**
         * <p>The memory resources of the gateway. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("GatewayMemory")
        public Long gatewayMemory;

        /**
         * <p>The billing method of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-tl32s6cgw00b</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance. The name must be 2 to 64 characters in length. Each letter or Chinese character is counted as a single character.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance owner.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678900000</p>
         */
        @NameInMap("InstanceOwner")
        public String instanceOwner;

        /**
         * <p>The instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-i7m2ncd6w002</p>
         */
        @NameInMap("LeaderInstanceId")
        public String leaderInstanceId;

        /**
         * <p>The memory size. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The role of instance in disaster recovery. Active: the primary instance. Passive: the secondary instance. PreActive: a primary instance that has not reached the desired state.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("ReplicaRole")
        public String replicaRole;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzuq7hpybze2i</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The storage class:</p>
         * <ul>
         * <li><p>redundant: Zone-redundant storage</p>
         * </li>
         * <li><p>local: Locally redundant storage</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>redundant</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The reason why the instance was stopped.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("SuspendReason")
        public String suspendReason;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetInstanceResponseBodyInstanceTags> tags;

        /**
         * <p>The instance version.</p>
         * 
         * <strong>example:</strong>
         * <p>r1.3.37</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
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

        public GetInstanceResponseBodyInstance setEnableSSL(Boolean enableSSL) {
            this.enableSSL = enableSSL;
            return this;
        }
        public Boolean getEnableSSL() {
            return this.enableSSL;
        }

        public GetInstanceResponseBodyInstance setEnableServerless(Boolean enableServerless) {
            this.enableServerless = enableServerless;
            return this;
        }
        public Boolean getEnableServerless() {
            return this.enableServerless;
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

        public GetInstanceResponseBodyInstance setGatewayCount(Long gatewayCount) {
            this.gatewayCount = gatewayCount;
            return this;
        }
        public Long getGatewayCount() {
            return this.gatewayCount;
        }

        public GetInstanceResponseBodyInstance setGatewayCpu(Long gatewayCpu) {
            this.gatewayCpu = gatewayCpu;
            return this;
        }
        public Long getGatewayCpu() {
            return this.gatewayCpu;
        }

        public GetInstanceResponseBodyInstance setGatewayMemory(Long gatewayMemory) {
            this.gatewayMemory = gatewayMemory;
            return this;
        }
        public Long getGatewayMemory() {
            return this.gatewayMemory;
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

        public GetInstanceResponseBodyInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetInstanceResponseBodyInstance setReplicaRole(String replicaRole) {
            this.replicaRole = replicaRole;
            return this;
        }
        public String getReplicaRole() {
            return this.replicaRole;
        }

        public GetInstanceResponseBodyInstance setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetInstanceResponseBodyInstance setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
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
