// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class IpBlock extends TeaModel {
    @NameInMap("Application")
    public String application;

    @NameInMap("BackupDeviceName")
    public String backupDeviceName;

    @NameInMap("Block")
    public String block;

    @NameInMap("BusinessTypeId")
    public String businessTypeId;

    @NameInMap("Category")
    public String category;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IpBlockId")
    public String ipBlockId;

    @NameInMap("Mask")
    public String mask;

    @NameInMap("NetBusiness")
    public String netBusiness;

    @NameInMap("NetType")
    public String netType;

    @NameInMap("Ownership")
    public String ownership;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("ReserveParentBlock")
    public String reserveParentBlock;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("UpdateType")
    public String updateType;

    @NameInMap("ZoneLayer")
    public java.util.List<IpBlockZoneLayer> zoneLayer;

    @NameInMap("ZoneName")
    public String zoneName;

    public static IpBlock build(java.util.Map<String, ?> map) throws Exception {
        IpBlock self = new IpBlock();
        return TeaModel.build(map, self);
    }

    public IpBlock setApplication(String application) {
        this.application = application;
        return this;
    }
    public String getApplication() {
        return this.application;
    }

    public IpBlock setBackupDeviceName(String backupDeviceName) {
        this.backupDeviceName = backupDeviceName;
        return this;
    }
    public String getBackupDeviceName() {
        return this.backupDeviceName;
    }

    public IpBlock setBlock(String block) {
        this.block = block;
        return this;
    }
    public String getBlock() {
        return this.block;
    }

    public IpBlock setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }
    public String getBusinessTypeId() {
        return this.businessTypeId;
    }

    public IpBlock setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public IpBlock setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public IpBlock setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IpBlock setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public IpBlock setIpBlockId(String ipBlockId) {
        this.ipBlockId = ipBlockId;
        return this;
    }
    public String getIpBlockId() {
        return this.ipBlockId;
    }

    public IpBlock setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public IpBlock setNetBusiness(String netBusiness) {
        this.netBusiness = netBusiness;
        return this;
    }
    public String getNetBusiness() {
        return this.netBusiness;
    }

    public IpBlock setNetType(String netType) {
        this.netType = netType;
        return this;
    }
    public String getNetType() {
        return this.netType;
    }

    public IpBlock setOwnership(String ownership) {
        this.ownership = ownership;
        return this;
    }
    public String getOwnership() {
        return this.ownership;
    }

    public IpBlock setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public IpBlock setReserveParentBlock(String reserveParentBlock) {
        this.reserveParentBlock = reserveParentBlock;
        return this;
    }
    public String getReserveParentBlock() {
        return this.reserveParentBlock;
    }

    public IpBlock setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public IpBlock setZoneName(String zoneName) {
        this.zoneName = zoneName;
        return this;
    }
    public String getZoneName() {
        return this.zoneName;
    }

    public static class IpBlockZoneLayer extends TeaModel {
        @NameInMap("Name")
        public String name;

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
