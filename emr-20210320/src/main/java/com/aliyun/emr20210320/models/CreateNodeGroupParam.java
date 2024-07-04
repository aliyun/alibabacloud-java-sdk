// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateNodeGroupParam extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <strong>example:</strong>
     * <p>Monthly</p>
     */
    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    @NameInMap("DataDisks")
    public java.util.List<DiskInfo> dataDisks;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <strong>example:</strong>
     * <p>core-1</p>
     */
    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    /**
     * <strong>example:</strong>
     * <p>CORE</p>
     */
    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    /**
     * <strong>example:</strong>
     * <p>sshkey</p>
     */
    @NameInMap("NodeKeyPairName")
    public String nodeKeyPairName;

    /**
     * <strong>example:</strong>
     * <p>AliyunEmrEcsDefaultRole</p>
     */
    @NameInMap("NodeRamRole")
    public String nodeRamRole;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("NodeRootPassword")
    public String nodeRootPassword;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <strong>example:</strong>
     * <p>Monthly</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>sg-hp3abbae8lb6lmb1****</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <strong>example:</strong>
     * <p>NoSpot</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("SystemDisk")
    public SystemDiskParam systemDisk;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("WithPublicIp")
    public Boolean withPublicIp;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
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
