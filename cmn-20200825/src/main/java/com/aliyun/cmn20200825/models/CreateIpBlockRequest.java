// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpBlockRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 资源一级ID
    @NameInMap("IpBlockId")
    public String ipBlockId;

    // IP段地址
    @NameInMap("Block")
    public String block;

    // IP段掩码
    @NameInMap("Mask")
    public String mask;

    // 父地址段UID
    @NameInMap("ParentId")
    public String parentId;

    // 公网私网标志 PUBLIC PRIVATE
    @NameInMap("NetType")
    public String netType;

    // 地址类别 IPV4
    @NameInMap("Category")
    public String category;

    // 地址状态
    @NameInMap("Status")
    public String status;

    // 业务类型UID
    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    // 设备名称
    @NameInMap("DeviceName")
    public String deviceName;

    // 园区名称
    @NameInMap("ZoneName")
    public String zoneName;

    // 备份设备名称
    @NameInMap("BackupDeviceName")
    public String backupDeviceName;

    // 公网地址类型 INC GUEST VIP
    @NameInMap("NetBusiness")
    public String netBusiness;

    // IP归属
    @NameInMap("Ownership")
    public String ownership;

    // IP用途
    @NameInMap("Application")
    public String application;

    // 备注
    @NameInMap("Description")
    public String description;

    // 是否保留父段 true 是 false 否
    @NameInMap("ReserveParentBlock")
    public String reserveParentBlock;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateIpBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIpBlockRequest self = new CreateIpBlockRequest();
        return TeaModel.build(map, self);
    }

    public CreateIpBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateIpBlockRequest setIpBlockId(String ipBlockId) {
        this.ipBlockId = ipBlockId;
        return this;
    }
    public String getIpBlockId() {
        return this.ipBlockId;
    }

    public CreateIpBlockRequest setBlock(String block) {
        this.block = block;
        return this;
    }
    public String getBlock() {
        return this.block;
    }

    public CreateIpBlockRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public CreateIpBlockRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateIpBlockRequest setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public CreateIpBlockRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateIpBlockRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateIpBlockRequest setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public CreateIpBlockRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateIpBlockRequest setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public CreateIpBlockRequest setBackupDeviceName(String backupDeviceName) {
        this.backupDeviceName = backupDeviceName;
        return this;
    }
    public String getBackupDeviceName() {
        return this.backupDeviceName;
    }

    public CreateIpBlockRequest setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

    public CreateIpBlockRequest setOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }
    public String getOwnership() {
        return this.ownership;
    }

    public CreateIpBlockRequest setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public CreateIpBlockRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIpBlockRequest setReserveParentBlock(String reserveParentBlock) {
        this.reserveParentBlock = reserveParentBlock;
        return this;
    }
    public String getReserveParentBlock() {
        return this.reserveParentBlock;
    }

    public CreateIpBlockRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
