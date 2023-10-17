// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class GetInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The details of the instance.</p>
     */
    @NameInMap("Instance")
    public GetInstanceResponseBodyInstance instance;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result, which indicates whether the request was successful.</p>
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
         * <p>The endpoint. This parameter is returned if both the AnyTunnel and SingleTunnel modes are enabled for an instance, and the instance is switched from the AnyTunnel mode to the SingleTunnel mode. In this case, two endpoints are returned.</p>
         */
        @NameInMap("AlternativeEndpoints")
        public String alternativeEndpoints;

        /**
         * <p>Indicates whether the network is enabled.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The endpoint.</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The network type.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   VPCSingleTunnel</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    virtual private cloud (VPC)</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   Intranet</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    internal network</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   VPCAnyTunnel</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    not supported by new instances</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Internet</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    Internet</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the vSwitch.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The VPC ID.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of VPC to which the instance belongs.</p>
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
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
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
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   false</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("AutoRenewal")
        public String autoRenewal;

        /**
         * <p>The cold storage capacity of the instance. Unit: GB. Standard SSD is used for hot storage, and HDD is used for cold storage.</p>
         */
        @NameInMap("ColdStorage")
        public Long coldStorage;

        /**
         * <p>The commodity code.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   hologram_maxcomputeAccelerate_public_cn</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    China site/Lakehouse Acceleration Edition</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   hologram_combo_public_cn</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    China site/Subscription</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   hologram_prepay_public_intl</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    International site/Subscription</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   hologram_storage_dp_cn</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    China site/Storage plan</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   hologram_postpay_public_cn</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    China site/Pay-as-you-go</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   hologram_postpay_public_intl</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    International site/Pay-as-you-go</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   hologram_maxcomputeAccelerate_public_intl</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    International site/Lakehouse Acceleration Edition</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   hologram_cu_dp_cn</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    China site/Compute plan</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The number of compute nodes. In a typical configuration, a node has 16 vCPUs and 32 GB of memory.</p>
         */
        @NameInMap("ComputeNodeCount")
        public Long computeNodeCount;

        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("Cpu")
        public Long cpu;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The amount of data that can be stored in the disk of the Standard storage class. Unit: GB.</p>
         */
        @NameInMap("Disk")
        public String disk;

        /**
         * <p>Indicates whether data lake acceleration is enabled.</p>
         */
        @NameInMap("EnableHiveAccess")
        public String enableHiveAccess;

        /**
         * <p>The list of endpoints.</p>
         */
        @NameInMap("Endpoints")
        public java.util.List<GetInstanceResponseBodyInstanceEndpoints> endpoints;

        /**
         * <p>The expiration time. This parameter is invalid for pay-as-you-go instances.</p>
         */
        @NameInMap("ExpirationTime")
        public String expirationTime;

        /**
         * <p>网关节点数量。</p>
         */
        @NameInMap("GatewayCount")
        public Long gatewayCount;

        /**
         * <p>网关cpu资源。</p>
         * <p>单位：core。</p>
         */
        @NameInMap("GatewayCpu")
        public Long gatewayCpu;

        /**
         * <p>网关内存资源。</p>
         * <p>单位：GB。</p>
         */
        @NameInMap("GatewayMemory")
        public Long gatewayMemory;

        /**
         * <p>The billing method of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   PostPaid</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    pay-as-you-go</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   PrePaid</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    subscription</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name. The instance name must be 2 to 64 characters in length.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The owner of the instance.</p>
         */
        @NameInMap("InstanceOwner")
        public String instanceOwner;

        /**
         * <p>The status of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Creating</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Running</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Suspended</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   Allocating</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("InstanceStatus")
        public String instanceStatus;

        /**
         * <p>The type of the instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   Follower</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    read-only secondary instance</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         * <br>
         * <p>*   Standard</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    normal instance</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    .</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The ID of the primary instance.</p>
         */
        @NameInMap("LeaderInstanceId")
        public String leaderInstanceId;

        /**
         * <p>The memory size. Unit: GB.</p>
         */
        @NameInMap("Memory")
        public Long memory;

        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The reason for the suspension.</p>
         */
        @NameInMap("SuspendReason")
        public String suspendReason;

        /**
         * <p>The instance tag.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetInstanceResponseBodyInstanceTags> tags;

        /**
         * <p>The instance version.</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>The ID of the zone where the instance resides.</p>
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
