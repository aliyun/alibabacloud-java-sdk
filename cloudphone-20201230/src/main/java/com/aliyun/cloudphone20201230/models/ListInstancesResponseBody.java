// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public ListInstancesResponseBodyInstances instances;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AllocationId")
        public String allocationId;

        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

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

    public static class ListInstancesResponseBodyInstancesInstanceVpcAttributes extends TeaModel {
        @NameInMap("PrivateIpAddress")
        public String privateIpAddress;

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
        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("EipAddress")
        public ListInstancesResponseBodyInstancesInstanceEipAddress eipAddress;

        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("KeyPairName")
        public String keyPairName;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("OsNameEn")
        public String osNameEn;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Resolution")
        public String resolution;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcAttributes")
        public ListInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes;

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

        public ListInstancesResponseBodyInstancesInstance setVpcAttributes(ListInstancesResponseBodyInstancesInstanceVpcAttributes vpcAttributes) {
            this.vpcAttributes = vpcAttributes;
            return this;
        }
        public ListInstancesResponseBodyInstancesInstanceVpcAttributes getVpcAttributes() {
            return this.vpcAttributes;
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
