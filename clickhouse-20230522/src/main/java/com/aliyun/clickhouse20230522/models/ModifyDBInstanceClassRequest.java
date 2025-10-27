// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassRequest extends TeaModel {
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

}
