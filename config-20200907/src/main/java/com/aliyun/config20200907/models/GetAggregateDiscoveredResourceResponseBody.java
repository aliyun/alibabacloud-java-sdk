// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateDiscoveredResourceResponseBody extends TeaModel {
    /**
     * <p>The details of the resource.</p>
     */
    @NameInMap("DiscoveredResourceDetail")
    public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E4D71ACE-6B0A-46E0-8352-56952378CC7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAggregateDiscoveredResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateDiscoveredResourceResponseBody self = new GetAggregateDiscoveredResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAggregateDiscoveredResourceResponseBody setDiscoveredResourceDetail(GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail discoveredResourceDetail) {
        this.discoveredResourceDetail = discoveredResourceDetail;
        return this;
    }
    public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail getDiscoveredResourceDetail() {
        return this.discoveredResourceDetail;
    }

    public GetAggregateDiscoveredResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>100931896542****</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <p>The ID of the zone where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("AvailabilityZone")
        public String availabilityZone;

        /**
         * <p>The compliance evaluation result. Valid values:</p>
         * <ul>
         * <li><p>COMPLIANT: The resource is compliant.</p>
         * </li>
         * <li><p>NON_COMPLIANT: The resource is non-compliant.</p>
         * </li>
         * <li><p>NOT_APPLICABLE: The rule did not apply to your resource.</p>
         * </li>
         * <li><p>INSUFFICIENT_DATA: No data is available.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLIANT</p>
         */
        @NameInMap("ComplianceType")
        public String complianceType;

        /**
         * <p>The configuration of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;ResourceGroupId\&quot;:\&quot;\&quot;,\&quot;Memory\&quot;:4096,\&quot;InstanceChargeType\&quot;:\&quot;PostPaid\&quot;,\&quot;Cpu\&quot;:2,\&quot;OSName\&quot;:\&quot;Windows Server  2022 数据中心版 64位中文版\&quot;,\&quot;InstanceNetworkType\&quot;:\&quot;vpc\&quot;,\&quot;InnerIpAddress\&quot;:{\&quot;IpAddress\&quot;:[]},\&quot;ExpiredTime\&quot;:\&quot;2099-12-31T15:59Z\&quot;,\&quot;ImageId\&quot;:\&quot;win2022_21H2_x64_dtc_zh-cn_40G_alibase_20240110.vhd\&quot;,\&quot;EipAddress\&quot;:{\&quot;AllocationId\&quot;:\&quot;\&quot;,\&quot;IpAddress\&quot;:\&quot;\&quot;,\&quot;InternetChargeType\&quot;:\&quot;\&quot;},\&quot;ImageOptions\&quot;:{},\&quot;VlanId\&quot;:\&quot;\&quot;,\&quot;HostName\&quot;:\&quot;iZl4i0brknq****\&quot;,\&quot;Status\&quot;:\&quot;Stopped\&quot;,\&quot;HibernationOptions\&quot;:{\&quot;Configured\&quot;:false},\&quot;MetadataOptions\&quot;:{\&quot;HttpTokens\&quot;:\&quot;\&quot;,\&quot;HttpEndpoint\&quot;:\&quot;\&quot;},\&quot;InstanceId\&quot;:\&quot;i-bp12g4xbl4i0brkn****\&quot;,\&quot;StoppedMode\&quot;:\&quot;KeepCharging\&quot;,\&quot;CpuOptions\&quot;:{\&quot;ThreadsPerCore\&quot;:2,\&quot;Numa\&quot;:\&quot;ON\&quot;,\&quot;CoreCount\&quot;:1},\&quot;StartTime\&quot;:\&quot;2024-02-29T07:08Z\&quot;,\&quot;DeletionProtection\&quot;:false,\&quot;VpcAttributes\&quot;:{\&quot;PrivateIpAddress\&quot;:{\&quot;IpAddress\&quot;:[\&quot;172.16.XX.XX\&quot;]},\&quot;VpcId\&quot;:\&quot;vpc-bp1wjaw8t272wwmkg****\&quot;,\&quot;VSwitchId\&quot;:\&quot;vsw-bp103i8xzww5132ul****\&quot;,\&quot;NatIpAddress\&quot;:\&quot;\&quot;},\&quot;SecurityGroupIds\&quot;:{\&quot;SecurityGroupId\&quot;:[\&quot;sg-bp1h96fz9fagaegp****\&quot;]},\&quot;InternetChargeType\&quot;:\&quot;PayByTraffic\&quot;,\&quot;InstanceName\&quot;:\&quot;test123\&quot;,\&quot;DeploymentSetId\&quot;:\&quot;\&quot;,\&quot;InternetMaxBandwidthOut\&quot;:5,\&quot;SerialNumber\&quot;:\&quot;6764f567-28fb-4a39-bfc3-48404995****\&quot;,\&quot;OSType\&quot;:\&quot;windows\&quot;,\&quot;CreationTime\&quot;:\&quot;2024-02-29T07:08Z\&quot;,\&quot;AutoReleaseTime\&quot;:\&quot;\&quot;,\&quot;Description\&quot;:\&quot;\&quot;,\&quot;InstanceTypeFamily\&quot;:\&quot;ecs.c7\&quot;,\&quot;DedicatedInstanceAttribute\&quot;:{\&quot;Tenancy\&quot;:\&quot;\&quot;,\&quot;Affinity\&quot;:\&quot;\&quot;},\&quot;PublicIpAddress\&quot;:{\&quot;IpAddress\&quot;:[\&quot;47.98.XX.XX\&quot;]},\&quot;GPUSpec\&quot;:\&quot;\&quot;,\&quot;NetworkInterfaces\&quot;:{\&quot;NetworkInterface\&quot;:[{\&quot;Type\&quot;:\&quot;Primary\&quot;,\&quot;PrimaryIpAddress\&quot;:\&quot;172.16.XX.XX\&quot;,\&quot;MacAddress\&quot;:\&quot;00:16:3e:0c:<strong>:</strong>\&quot;,\&quot;NetworkInterfaceId\&quot;:\&quot;eni-bp19uj35v8won3x9****\&quot;,\&quot;PrivateIpSets\&quot;:{\&quot;PrivateIpSet\&quot;:[{\&quot;PrivateIpAddress\&quot;:\&quot;172.16.XX.XX\&quot;,\&quot;Primary\&quot;:true}]}}]},\&quot;SpotPriceLimit\&quot;:0.0,\&quot;SaleCycle\&quot;:\&quot;\&quot;,\&quot;DeviceAvailable\&quot;:true,\&quot;InstanceType\&quot;:\&quot;ecs.c7.large\&quot;,\&quot;OSNameEn\&quot;:\&quot;Windows Server  2022 DataCenter Edition 64bit Chinese Edition\&quot;,\&quot;SpotStrategy\&quot;:\&quot;NoSpot\&quot;,\&quot;IoOptimized\&quot;:true,\&quot;ZoneId\&quot;:\&quot;cn-hangzhou-b\&quot;,\&quot;ClusterId\&quot;:\&quot;\&quot;,\&quot;EcsCapacityReservationAttr\&quot;:{\&quot;CapacityReservationPreference\&quot;:\&quot;\&quot;,\&quot;CapacityReservationId\&quot;:\&quot;\&quot;},\&quot;DedicatedHostAttribute\&quot;:{\&quot;DedicatedHostId\&quot;:\&quot;\&quot;,\&quot;DedicatedHostName\&quot;:\&quot;\&quot;,\&quot;DedicatedHostClusterId\&quot;:\&quot;\&quot;},\&quot;GPUAmount\&quot;:0,\&quot;OperationLocks\&quot;:{\&quot;LockReason\&quot;:[]},\&quot;InternetMaxBandwidthIn\&quot;:2000,\&quot;Recyclable\&quot;:false,\&quot;RegionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;CreditSpecification\&quot;:\&quot;\&quot;}</p>
         */
        @NameInMap("Configuration")
        public String configuration;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The timestamp when the resource was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1624961112000</p>
         */
        @NameInMap("ResourceCreationTime")
        public Long resourceCreationTime;

        /**
         * <p>Indicates whether the resource was deleted. Valid values:</p>
         * <ul>
         * <li><p>1: The resource was not deleted.</p>
         * </li>
         * <li><p>0: The resource was deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResourceDeleted")
        public Integer resourceDeleted;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp12g4xbl4i0brkn****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <p>The resource status. The value of this parameter varies based on the resource type and may be empty. For example:</p>
         * <ul>
         * <li><p>If the ResourceType parameter is set to ACS::ECS::Instance, the resource is an ECS instance that has a specific state. In this case, the valid values of this parameter are Running and Stopped.</p>
         * </li>
         * <li><p>If the ResourceType parameter is ACS::OSS::Bucket, the resource is an Object Storage Service (OSS) bucket that is not in a specific state. In this case, this parameter is left empty.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("ResourceStatus")
        public String resourceStatus;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The resource tags.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;\&quot;hc\&quot;\&quot;:[\&quot;\&quot;value2\&quot;\&quot;]}</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The ID of the vSwitch to which the resource belongs, in the format of vsw-t4n7pokxxxxxxxxxxxxxx. If the resource belongs to multiple vSwitches, the IDs are separated by commas, such as vsw-t4n7pokxxxxxxxxxxxxxx, vsw-t4n7pokxxxxxxxxxxxxxx. If the resource does not belong to any vSwitch, an empty string is returned: &quot;&quot;</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-t4n7pokxxxxxxxxxxxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The ID of the VPC to which the resource belongs, in the format of vpc-t4nhheyvay74fp7n0hxxx. If the resource does not belong to a VPC, an empty string is returned: &quot;&quot;</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-t4nhheyvay74fp7n0hxxx</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail build(java.util.Map<String, ?> map) throws Exception {
            GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail self = new GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail();
            return TeaModel.build(map, self);
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setComplianceType(String complianceType) {
            this.complianceType = complianceType;
            return this;
        }
        public String getComplianceType() {
            return this.complianceType;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }
        public String getConfiguration() {
            return this.configuration;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceCreationTime(Long resourceCreationTime) {
            this.resourceCreationTime = resourceCreationTime;
            return this;
        }
        public Long getResourceCreationTime() {
            return this.resourceCreationTime;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceDeleted(Integer resourceDeleted) {
            this.resourceDeleted = resourceDeleted;
            return this;
        }
        public Integer getResourceDeleted() {
            return this.resourceDeleted;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceStatus(String resourceStatus) {
            this.resourceStatus = resourceStatus;
            return this;
        }
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetAggregateDiscoveredResourceResponseBodyDiscoveredResourceDetail setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
