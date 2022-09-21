// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateNodeGroupParam extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    @NameInMap("DataDisks")
    public java.util.List<DiskInfo> dataDisks;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    @NameInMap("NodeKeyPairName")
    public String nodeKeyPairName;

    @NameInMap("NodeRamRole")
    public String nodeRamRole;

    @NameInMap("NodeRootPassword")
    public String nodeRootPassword;

    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDisk")
    public SystemDiskParam systemDisk;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("WithPublicIp")
    public Boolean withPublicIp;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeGroupParam self = new CreateNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public CreateNodeGroupParam setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateNodeGroupParam setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public CreateNodeGroupParam setAutoRenewDurationUnit(String autoRenewDurationUnit) {
        this.autoRenewDurationUnit = autoRenewDurationUnit;
        return this;
    }
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    public CreateNodeGroupParam setDataDisks(java.util.List<DiskInfo> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<DiskInfo> getDataDisks() {
        return this.dataDisks;
    }

    public CreateNodeGroupParam setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public CreateNodeGroupParam setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public CreateNodeGroupParam setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public CreateNodeGroupParam setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public CreateNodeGroupParam setNodeKeyPairName(String nodeKeyPairName) {
        this.nodeKeyPairName = nodeKeyPairName;
        return this;
    }
    public String getNodeKeyPairName() {
        return this.nodeKeyPairName;
    }

    public CreateNodeGroupParam setNodeRamRole(String nodeRamRole) {
        this.nodeRamRole = nodeRamRole;
        return this;
    }
    public String getNodeRamRole() {
        return this.nodeRamRole;
    }

    public CreateNodeGroupParam setNodeRootPassword(String nodeRootPassword) {
        this.nodeRootPassword = nodeRootPassword;
        return this;
    }
    public String getNodeRootPassword() {
        return this.nodeRootPassword;
    }

    public CreateNodeGroupParam setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public CreateNodeGroupParam setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public CreateNodeGroupParam setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateNodeGroupParam setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public CreateNodeGroupParam setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public CreateNodeGroupParam setSystemDisk(SystemDiskParam systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDiskParam getSystemDisk() {
        return this.systemDisk;
    }

    public CreateNodeGroupParam setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CreateNodeGroupParam setWithPublicIp(Boolean withPublicIp) {
        this.withPublicIp = withPublicIp;
        return this;
    }
    public Boolean getWithPublicIp() {
        return this.withPublicIp;
    }

    public CreateNodeGroupParam setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
