// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ResizeClusterV2Request extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("AutoPayOrder")
    public Boolean autoPayOrder;

    @NameInMap("VswitchId")
    public String vswitchId;

    @NameInMap("IsOpenPublicIp")
    public Boolean isOpenPublicIp;

    @NameInMap("HostComponentInfo")
    public java.util.List<ResizeClusterV2RequestHostComponentInfo> hostComponentInfo;

    @NameInMap("HostGroup")
    public java.util.List<ResizeClusterV2RequestHostGroup> hostGroup;

    @NameInMap("PromotionInfo")
    public java.util.List<ResizeClusterV2RequestPromotionInfo> promotionInfo;

    public static ResizeClusterV2Request build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterV2Request self = new ResizeClusterV2Request();
        return TeaModel.build(map, self);
    }

    public ResizeClusterV2Request setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeClusterV2Request setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeClusterV2Request setAutoPayOrder(Boolean autoPayOrder) {
        this.autoPayOrder = autoPayOrder;
        return this;
    }
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    public ResizeClusterV2Request setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public ResizeClusterV2Request setIsOpenPublicIp(Boolean isOpenPublicIp) {
        this.isOpenPublicIp = isOpenPublicIp;
        return this;
    }
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    public ResizeClusterV2Request setHostComponentInfo(java.util.List<ResizeClusterV2RequestHostComponentInfo> hostComponentInfo) {
        this.hostComponentInfo = hostComponentInfo;
        return this;
    }
    public java.util.List<ResizeClusterV2RequestHostComponentInfo> getHostComponentInfo() {
        return this.hostComponentInfo;
    }

    public ResizeClusterV2Request setHostGroup(java.util.List<ResizeClusterV2RequestHostGroup> hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public java.util.List<ResizeClusterV2RequestHostGroup> getHostGroup() {
        return this.hostGroup;
    }

    public ResizeClusterV2Request setPromotionInfo(java.util.List<ResizeClusterV2RequestPromotionInfo> promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }
    public java.util.List<ResizeClusterV2RequestPromotionInfo> getPromotionInfo() {
        return this.promotionInfo;
    }

    public static class ResizeClusterV2RequestHostComponentInfo extends TeaModel {
        @NameInMap("ComponentNameList")
        public java.util.List<String> componentNameList;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ServiceName")
        public String serviceName;

        public static ResizeClusterV2RequestHostComponentInfo build(java.util.Map<String, ?> map) throws Exception {
            ResizeClusterV2RequestHostComponentInfo self = new ResizeClusterV2RequestHostComponentInfo();
            return TeaModel.build(map, self);
        }

        public ResizeClusterV2RequestHostComponentInfo setComponentNameList(java.util.List<String> componentNameList) {
            this.componentNameList = componentNameList;
            return this;
        }
        public java.util.List<String> getComponentNameList() {
            return this.componentNameList;
        }

        public ResizeClusterV2RequestHostComponentInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ResizeClusterV2RequestHostComponentInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ResizeClusterV2RequestHostGroup extends TeaModel {
        @NameInMap("SysDiskCapacity")
        public Integer sysDiskCapacity;

        @NameInMap("HostGroupType")
        public String hostGroupType;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("VswitchId")
        public Integer vswitchId;

        @NameInMap("SysDiskType")
        public String sysDiskType;

        @NameInMap("AutoRenew")
        public Boolean autoRenew;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("HostGroupId")
        public String hostGroupId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("HostKeyPairName")
        public String hostKeyPairName;

        @NameInMap("DiskCount")
        public Integer diskCount;

        @NameInMap("CreateType")
        public String createType;

        @NameInMap("Period")
        public Integer period;

        @NameInMap("HostPassword")
        public String hostPassword;

        @NameInMap("DiskCapacity")
        public Integer diskCapacity;

        @NameInMap("NodeCount")
        public Integer nodeCount;

        @NameInMap("HostGroupName")
        public String hostGroupName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static ResizeClusterV2RequestHostGroup build(java.util.Map<String, ?> map) throws Exception {
            ResizeClusterV2RequestHostGroup self = new ResizeClusterV2RequestHostGroup();
            return TeaModel.build(map, self);
        }

        public ResizeClusterV2RequestHostGroup setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public ResizeClusterV2RequestHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public ResizeClusterV2RequestHostGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ResizeClusterV2RequestHostGroup setVswitchId(Integer vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public Integer getVswitchId() {
            return this.vswitchId;
        }

        public ResizeClusterV2RequestHostGroup setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public ResizeClusterV2RequestHostGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ResizeClusterV2RequestHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ResizeClusterV2RequestHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ResizeClusterV2RequestHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ResizeClusterV2RequestHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ResizeClusterV2RequestHostGroup setHostKeyPairName(String hostKeyPairName) {
            this.hostKeyPairName = hostKeyPairName;
            return this;
        }
        public String getHostKeyPairName() {
            return this.hostKeyPairName;
        }

        public ResizeClusterV2RequestHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public ResizeClusterV2RequestHostGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public ResizeClusterV2RequestHostGroup setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ResizeClusterV2RequestHostGroup setHostPassword(String hostPassword) {
            this.hostPassword = hostPassword;
            return this;
        }
        public String getHostPassword() {
            return this.hostPassword;
        }

        public ResizeClusterV2RequestHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public ResizeClusterV2RequestHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ResizeClusterV2RequestHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public ResizeClusterV2RequestHostGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ResizeClusterV2RequestPromotionInfo extends TeaModel {
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        @NameInMap("PromotionOptionCode")
        public String promotionOptionCode;

        @NameInMap("ProductCode")
        public String productCode;

        public static ResizeClusterV2RequestPromotionInfo build(java.util.Map<String, ?> map) throws Exception {
            ResizeClusterV2RequestPromotionInfo self = new ResizeClusterV2RequestPromotionInfo();
            return TeaModel.build(map, self);
        }

        public ResizeClusterV2RequestPromotionInfo setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public ResizeClusterV2RequestPromotionInfo setPromotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }
        public String getPromotionOptionCode() {
            return this.promotionOptionCode;
        }

        public ResizeClusterV2RequestPromotionInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
