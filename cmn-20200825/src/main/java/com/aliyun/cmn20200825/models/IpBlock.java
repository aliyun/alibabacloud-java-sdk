// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class IpBlock extends TeaModel {
    // 资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 创建时间
    @NameInMap("CreateTime")
    public String createTime;

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

    // 更新类型 update 更新 split 拆分
    @NameInMap("UpdateType")
    public String updateType;

    // 园区层级
    @NameInMap("ZoneLayer")
    public java.util.List<IpBlockZoneLayer> zoneLayer;

    public static IpBlock build(java.util.Map<String, ?> map) throws Exception {
        IpBlock self = new IpBlock();
        return TeaModel.build(map, self);
    }

    public IpBlock setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public IpBlock setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IpBlock setIpBlockId(String ipBlockId) {
        this.ipBlockId = ipBlockId;
        return this;
    }
    public String getIpBlockId() {
        return this.ipBlockId;
    }

    public IpBlock setBlock(String block) {
        this.block = block;
        return this;
    }
    public String getBlock() {
        return this.block;
    }

    public IpBlock setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public IpBlock setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public IpBlock setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public IpBlock setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public IpBlock setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public IpBlock setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IpBlock setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public IpBlock setBackupDeviceName(String backupDeviceName) {
        this.backupDeviceName = backupDeviceName;
        return this;
    }
    public String getBackupDeviceName() {
        return this.backupDeviceName;
    }

    public IpBlock setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

    public IpBlock setOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }
    public String getOwnership() {
        return this.ownership;
    }

    public IpBlock setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public IpBlock setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IpBlock setReserveParentBlock(String reserveParentBlock) {
        this.reserveParentBlock = reserveParentBlock;
        return this;
    }
    public String getReserveParentBlock() {
        return this.reserveParentBlock;
    }

    public IpBlock setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

    public IpBlock setZoneLayer(java.util.List<IpBlockZoneLayer> zoneLayer) {
        this.zoneLayer = zoneLayer;
        return this;
    }
    public java.util.List<IpBlockZoneLayer> getZoneLayer() {
        return this.zoneLayer;
    }

    public static class IpBlockZoneLayer extends TeaModel {
        // 园区层级名称
        @NameInMap("Name")
        public String name;

        // 园区层级值
        @NameInMap("Value")
        public String value;

        public static IpBlockZoneLayer build(java.util.Map<String, ?> map) throws Exception {
            IpBlockZoneLayer self = new IpBlockZoneLayer();
            return TeaModel.build(map, self);
        }

        public IpBlockZoneLayer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public IpBlockZoneLayer setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
