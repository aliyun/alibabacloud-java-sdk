// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ResizeClusterRequest extends TeaModel {
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
    public java.util.List<ResizeClusterRequestHostComponentInfo> hostComponentInfo;

    @NameInMap("HostGroup")
    public java.util.List<ResizeClusterRequestHostGroup> hostGroup;

    @NameInMap("PromotionInfo")
    public java.util.List<ResizeClusterRequestPromotionInfo> promotionInfo;

    public static ResizeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterRequest self = new ResizeClusterRequest();
        return TeaModel.build(map, self);
    }

    public ResizeClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResizeClusterRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ResizeClusterRequest setAutoPayOrder(Boolean autoPayOrder) {
        this.autoPayOrder = autoPayOrder;
        return this;
    }
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    public ResizeClusterRequest setVswitchId(String vswitchId) {
        this.vswitchId = vswitchId;
        return this;
    }
    public String getVswitchId() {
        return this.vswitchId;
    }

    public ResizeClusterRequest setIsOpenPublicIp(Boolean isOpenPublicIp) {
        this.isOpenPublicIp = isOpenPublicIp;
        return this;
    }
    public Boolean getIsOpenPublicIp() {
        return this.isOpenPublicIp;
    }

    public ResizeClusterRequest setHostComponentInfo(java.util.List<ResizeClusterRequestHostComponentInfo> hostComponentInfo) {
        this.hostComponentInfo = hostComponentInfo;
        return this;
    }
    public java.util.List<ResizeClusterRequestHostComponentInfo> getHostComponentInfo() {
        return this.hostComponentInfo;
    }

    public ResizeClusterRequest setHostGroup(java.util.List<ResizeClusterRequestHostGroup> hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public java.util.List<ResizeClusterRequestHostGroup> getHostGroup() {
        return this.hostGroup;
    }

    public ResizeClusterRequest setPromotionInfo(java.util.List<ResizeClusterRequestPromotionInfo> promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }
    public java.util.List<ResizeClusterRequestPromotionInfo> getPromotionInfo() {
        return this.promotionInfo;
    }

    public static class ResizeClusterRequestHostComponentInfo extends TeaModel {
        @NameInMap("ComponentNameList")
        public java.util.List<String> componentNameList;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ServiceName")
        public String serviceName;

        public static ResizeClusterRequestHostComponentInfo build(java.util.Map<String, ?> map) throws Exception {
            ResizeClusterRequestHostComponentInfo self = new ResizeClusterRequestHostComponentInfo();
            return TeaModel.build(map, self);
        }

        public ResizeClusterRequestHostComponentInfo setComponentNameList(java.util.List<String> componentNameList) {
            this.componentNameList = componentNameList;
            return this;
        }
        public java.util.List<String> getComponentNameList() {
            return this.componentNameList;
        }

        public ResizeClusterRequestHostComponentInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ResizeClusterRequestHostComponentInfo setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ResizeClusterRequestHostGroup extends TeaModel {
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

        public static ResizeClusterRequestHostGroup build(java.util.Map<String, ?> map) throws Exception {
            ResizeClusterRequestHostGroup self = new ResizeClusterRequestHostGroup();
            return TeaModel.build(map, self);
        }

        public ResizeClusterRequestHostGroup setSysDiskCapacity(Integer sysDiskCapacity) {
            this.sysDiskCapacity = sysDiskCapacity;
            return this;
        }
        public Integer getSysDiskCapacity() {
            return this.sysDiskCapacity;
        }

        public ResizeClusterRequestHostGroup setHostGroupType(String hostGroupType) {
            this.hostGroupType = hostGroupType;
            return this;
        }
        public String getHostGroupType() {
            return this.hostGroupType;
        }

        public ResizeClusterRequestHostGroup setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ResizeClusterRequestHostGroup setVswitchId(Integer vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public Integer getVswitchId() {
            return this.vswitchId;
        }

        public ResizeClusterRequestHostGroup setSysDiskType(String sysDiskType) {
            this.sysDiskType = sysDiskType;
            return this;
        }
        public String getSysDiskType() {
            return this.sysDiskType;
        }

        public ResizeClusterRequestHostGroup setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public ResizeClusterRequestHostGroup setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ResizeClusterRequestHostGroup setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ResizeClusterRequestHostGroup setHostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        public ResizeClusterRequestHostGroup setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ResizeClusterRequestHostGroup setHostKeyPairName(String hostKeyPairName) {
            this.hostKeyPairName = hostKeyPairName;
            return this;
        }
        public String getHostKeyPairName() {
            return this.hostKeyPairName;
        }

        public ResizeClusterRequestHostGroup setDiskCount(Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Integer getDiskCount() {
            return this.diskCount;
        }

        public ResizeClusterRequestHostGroup setCreateType(String createType) {
            this.createType = createType;
            return this;
        }
        public String getCreateType() {
            return this.createType;
        }

        public ResizeClusterRequestHostGroup setPeriod(Integer period) {
            this.period = period;
            return this;
        }
        public Integer getPeriod() {
            return this.period;
        }

        public ResizeClusterRequestHostGroup setHostPassword(String hostPassword) {
            this.hostPassword = hostPassword;
            return this;
        }
        public String getHostPassword() {
            return this.hostPassword;
        }

        public ResizeClusterRequestHostGroup setDiskCapacity(Integer diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public Integer getDiskCapacity() {
            return this.diskCapacity;
        }

        public ResizeClusterRequestHostGroup setNodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        public ResizeClusterRequestHostGroup setHostGroupName(String hostGroupName) {
            this.hostGroupName = hostGroupName;
            return this;
        }
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        public ResizeClusterRequestHostGroup setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class ResizeClusterRequestPromotionInfo extends TeaModel {
        @NameInMap("PromotionOptionNo")
        public String promotionOptionNo;

        @NameInMap("PromotionOptionCode")
        public String promotionOptionCode;

        @NameInMap("ProductCode")
        public String productCode;

        public static ResizeClusterRequestPromotionInfo build(java.util.Map<String, ?> map) throws Exception {
            ResizeClusterRequestPromotionInfo self = new ResizeClusterRequestPromotionInfo();
            return TeaModel.build(map, self);
        }

        public ResizeClusterRequestPromotionInfo setPromotionOptionNo(String promotionOptionNo) {
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }
        public String getPromotionOptionNo() {
            return this.promotionOptionNo;
        }

        public ResizeClusterRequestPromotionInfo setPromotionOptionCode(String promotionOptionCode) {
            this.promotionOptionCode = promotionOptionCode;
            return this;
        }
        public String getPromotionOptionCode() {
            return this.promotionOptionCode;
        }

        public ResizeClusterRequestPromotionInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

}
