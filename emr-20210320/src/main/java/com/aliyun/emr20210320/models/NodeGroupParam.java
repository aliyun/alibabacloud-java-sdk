// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroupParam extends TeaModel {
    @NameInMap("AutoPayOrder")
    public Boolean autoPayOrder;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    @NameInMap("DataDisks")
    public java.util.List<DiskInfo> dataDisks;

    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceTypes")
    public java.util.List<String> instanceTypes;

    @NameInMap("NodeCount")
    public Integer nodeCount;

    @NameInMap("NodeGroupIndex")
    public Integer nodeGroupIndex;

    @NameInMap("NodeGroupName")
    public String nodeGroupName;

    @NameInMap("NodeGroupType")
    public String nodeGroupType;

    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("SystemDisk")
    public SystemDiskParam systemDisk;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    @NameInMap("ZoneId")
    public String zoneId;

    public static NodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupParam self = new NodeGroupParam();
        return TeaModel.build(map, self);
    }

    public NodeGroupParam setAutoPayOrder(Boolean autoPayOrder) {
        this.autoPayOrder = autoPayOrder;
        return this;
    }
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    public NodeGroupParam setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public NodeGroupParam setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public NodeGroupParam setAutoRenewDurationUnit(String autoRenewDurationUnit) {
        this.autoRenewDurationUnit = autoRenewDurationUnit;
        return this;
    }
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    public NodeGroupParam setDataDisks(java.util.List<DiskInfo> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }
    public java.util.List<DiskInfo> getDataDisks() {
        return this.dataDisks;
    }

    public NodeGroupParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public NodeGroupParam setInstanceTypes(java.util.List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<String> getInstanceTypes() {
        return this.instanceTypes;
    }

    public NodeGroupParam setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public NodeGroupParam setNodeGroupIndex(Integer nodeGroupIndex) {
        this.nodeGroupIndex = nodeGroupIndex;
        return this;
    }
    public Integer getNodeGroupIndex() {
        return this.nodeGroupIndex;
    }

    public NodeGroupParam setNodeGroupName(String nodeGroupName) {
        this.nodeGroupName = nodeGroupName;
        return this;
    }
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    public NodeGroupParam setNodeGroupType(String nodeGroupType) {
        this.nodeGroupType = nodeGroupType;
        return this;
    }
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    public NodeGroupParam setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public NodeGroupParam setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public NodeGroupParam setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public NodeGroupParam setSystemDisk(SystemDiskParam systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDiskParam getSystemDisk() {
        return this.systemDisk;
    }

    public NodeGroupParam setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

    public NodeGroupParam setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
