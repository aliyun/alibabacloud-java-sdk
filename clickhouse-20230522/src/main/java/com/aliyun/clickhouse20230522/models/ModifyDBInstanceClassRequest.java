// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassRequest extends TeaModel {
    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoScaleConfig")
    public ModifyDBInstanceClassRequestAutoScaleConfig autoScaleConfig;

    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NodeScaleMax")
    public Integer nodeScaleMax;

    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("NodeScaleMin")
    public Integer nodeScaleMin;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The maximum capacity for elastic scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ScaleMax")
    public Long scaleMax;

    /**
     * <p>The minimum capacity for elastic scaling.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ScaleMin")
    public Long scaleMin;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StorageQuota")
    public Long storageQuota;

    /**
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static ModifyDBInstanceClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassRequest self = new ModifyDBInstanceClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassRequest setAutoScaleConfig(ModifyDBInstanceClassRequestAutoScaleConfig autoScaleConfig) {
        this.autoScaleConfig = autoScaleConfig;
        return this;
    }
    public ModifyDBInstanceClassRequestAutoScaleConfig getAutoScaleConfig() {
        return this.autoScaleConfig;
    }

    public ModifyDBInstanceClassRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    public ModifyDBInstanceClassRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceClassRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public ModifyDBInstanceClassRequest setNodeScaleMax(Integer nodeScaleMax) {
        this.nodeScaleMax = nodeScaleMax;
        return this;
    }
    public Integer getNodeScaleMax() {
        return this.nodeScaleMax;
    }

    public ModifyDBInstanceClassRequest setNodeScaleMin(Integer nodeScaleMin) {
        this.nodeScaleMin = nodeScaleMin;
        return this;
    }
    public Integer getNodeScaleMin() {
        return this.nodeScaleMin;
    }

    public ModifyDBInstanceClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBInstanceClassRequest setScaleMax(Long scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public Long getScaleMax() {
        return this.scaleMax;
    }

    public ModifyDBInstanceClassRequest setScaleMin(Long scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public Long getScaleMin() {
        return this.scaleMin;
    }

    public ModifyDBInstanceClassRequest setStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }
    public Long getStorageQuota() {
        return this.storageQuota;
    }

    public ModifyDBInstanceClassRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public static class ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos extends TeaModel {
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-XXX</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos self = new ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class ModifyDBInstanceClassRequestAutoScaleConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BurstNum")
        public Integer burstNum;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("VSwitchInfos")
        public java.util.List<ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos> vSwitchInfos;

        public static ModifyDBInstanceClassRequestAutoScaleConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceClassRequestAutoScaleConfig self = new ModifyDBInstanceClassRequestAutoScaleConfig();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceClassRequestAutoScaleConfig setBurstNum(Integer burstNum) {
            this.burstNum = burstNum;
            return this;
        }
        public Integer getBurstNum() {
            return this.burstNum;
        }

        public ModifyDBInstanceClassRequestAutoScaleConfig setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ModifyDBInstanceClassRequestAutoScaleConfig setVSwitchInfos(java.util.List<ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos> vSwitchInfos) {
            this.vSwitchInfos = vSwitchInfos;
            return this;
        }
        public java.util.List<ModifyDBInstanceClassRequestAutoScaleConfigVSwitchInfos> getVSwitchInfos() {
            return this.vSwitchInfos;
        }

    }

}
