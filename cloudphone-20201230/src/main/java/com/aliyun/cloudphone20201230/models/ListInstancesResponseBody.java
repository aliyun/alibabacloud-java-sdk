// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>Details of the instances.</p>
     */
    @NameInMap("Instances")
    public ListInstancesResponseBodyInstances instances;

    /**
     * <p>The maximum number of entries returned on each page. Valid values: 1 to 100.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries that is returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(ListInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public ListInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListInstancesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesInstanceEipAddress extends TeaModel {
        /**
         * <p>The ID of the EIP that is used by the instance.</p>
         */
        @NameInMap("AllocationId")
        public String allocationId;

        /**
         * <p>The bandwidth of the EIP.</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The billing method of the EIP.</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The EIP.</p>
         */
        @NameInMap("IpAddress")
        public String ipAddress;

        public static ListInstancesResponseBodyInstancesInstanceEipAddress build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesInstanceEipAddress self = new ListInstancesResponseBodyInstancesInstanceEipAddress();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesInstanceEipAddress setAllocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }
        public String getAllocationId() {
            return this.allocationId;
        }

        public ListInstancesResponseBodyInstancesInstanceEipAddress setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListInstancesResponseBodyInstancesInstanceEipAddress setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public ListInstancesResponseBodyInstancesInstanceEipAddress setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

    }

    public static class ListInstancesResponseBodyInstancesInstanceTagsTag extends TeaModel {
        /**
         * <p>The tag key of the instance.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyInstancesInstanceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesInstanceTagsTag self = new ListInstancesResponseBodyInstancesInstanceTagsTag();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesInstanceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyInstancesInstanceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyInstancesInstanceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<ListInstancesResponseBodyInstancesInstanceTagsTag> tag;

        public static ListInstancesResponseBodyInstancesInstanceTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesInstanceTags self = new ListInstancesResponseBodyInstancesInstanceTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesInstanceTags setTag(java.util.List<ListInstancesResponseBodyInstancesInstanceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesInstanceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class ListInstancesResponseBodyInstancesInstanceVpcAttributes extends TeaModel {
        /**
         * <p>The private IP address.</p>
         */
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

        /**
         * <p>The vSwitch ID.</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static ListInstancesResponseBodyInstancesInstanceVpcAttributes build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesInstanceVpcAttributes self = new ListInstancesResponseBodyInstancesInstanceVpcAttributes();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesInstanceVpcAttributes setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }
        public String getPrivateIpAddress() {
            return this.privateIpAddress;
        }

        public ListInstancesResponseBodyInstancesInstanceVpcAttributes setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

    public static class ListInstancesResponseBodyInstancesInstance extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal is enabled. This parameter takes effect only for subscription instances.</p>
         */
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        /**
         * <p>The billing method of the instance.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>The time when the image was created. The time follows the ISO 8601 standard.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The instance description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The information about the elastic IP address (EIP) of the instance.</p>
         */
        @NameInMap("EipAddress")
        public ListInstancesResponseBodyInstancesInstanceEipAddress eipAddress;

        /**
         * <p>The time when the subscription instance expires.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The image ID.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The instance type.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of the key pair for the instance.</p>
         */
        @NameInMap("KeyPairName")
        public String keyPairName;

        /**
         * <p>The display name of the OS in Chinese.</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The display name of the OS in English.</p>
         */
        @NameInMap("OsNameEn")
        public String osNameEn;

        /**
         * <p>The region ID.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The resolution of the instance.</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The ID of the security group that the instance uses. The security group is the same as that of the Elastic Compute Service (ECS) instance that you use.</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The instance state. Valid values:</p>
         * <br>
         * <p>*   Pending: The instance is being created.</p>
         * <p>*   Running: The instance is running.</p>
         * <p>*   Starting: The instance is being started.</p>
         * <p>*   Stopping: The instance is being stopped.</p>
         * <p>*   Stopped: The instance is stopped.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags of the instance.</p>
         */
        @NameInMap("Tags")
        public ListInstancesResponseBodyInstancesInstanceTags tags;

        /**
         * <p>The information about the virtual private cloud (VPC) in which the instance is deployed.</p>
         */
        @NameInMap("VpcAttributes")
        public ListInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes;

        /**
         * <p>The information about webRtcToken.</p>
         */
        @NameInMap("WebRtcToken")
        public String webRtcToken;

        /**
         * <p>The zone ID.</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ListInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesInstance self = new ListInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesInstance setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ListInstancesResponseBodyInstancesInstance setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListInstancesResponseBodyInstancesInstance setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListInstancesResponseBodyInstancesInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListInstancesResponseBodyInstancesInstance setEipAddress(ListInstancesResponseBodyInstancesInstanceEipAddress eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public ListInstancesResponseBodyInstancesInstanceEipAddress getEipAddress() {
            return this.eipAddress;
        }

        public ListInstancesResponseBodyInstancesInstance setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListInstancesResponseBodyInstancesInstance setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstancesInstance setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListInstancesResponseBodyInstancesInstance setKeyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }
        public String getKeyPairName() {
            return this.keyPairName;
        }

        public ListInstancesResponseBodyInstancesInstance setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public ListInstancesResponseBodyInstancesInstance setOsNameEn(String osNameEn) {
            this.osNameEn = osNameEn;
            return this;
        }
        public String getOsNameEn() {
            return this.osNameEn;
        }

        public ListInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstancesInstance setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public ListInstancesResponseBodyInstancesInstance setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstancesInstance setTags(ListInstancesResponseBodyInstancesInstanceTags tags) {
            this.tags = tags;
            return this;
        }
        public ListInstancesResponseBodyInstancesInstanceTags getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyInstancesInstance setVpcAttributes(ListInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }
        public ListInstancesResponseBodyInstancesInstanceVpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
        }

        public ListInstancesResponseBodyInstancesInstance setWebRtcToken(String webRtcToken) {
            this.webRtcToken = webRtcToken;
            return this;
        }
        public String getWebRtcToken() {
            return this.webRtcToken;
        }

        public ListInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<ListInstancesResponseBodyInstancesInstance> instance;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setInstance(java.util.List<ListInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
