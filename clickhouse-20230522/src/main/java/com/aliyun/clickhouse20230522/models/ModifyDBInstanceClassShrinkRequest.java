// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceClassShrinkRequest extends TeaModel {
    /**
     * <p>The autoscaling configuration for the compute group.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoScaleConfig")
    public String autoScaleConfigShrink;

    /**
     * <p>The compute group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-gs5j3sua77*******-clickhouse</p>
     */
    @NameInMap("ComputingGroupId")
    public String computingGroupId;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-gs5j3sua77*******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The number of nodes. Valid values: 2 to 16.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>The maximum capacity per node for serverless autoscaling. Valid values: 4 to 32. This value must be greater than the minimum value.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("NodeScaleMax")
    public Integer nodeScaleMax;

    /**
     * <p>The minimum capacity per node for serverless autoscaling. Valid values: 4 to 32.</p>
     * 
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
     * <p>The maximum capacity for serverless autoscaling.</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ScaleMax")
    public Long scaleMax;

    /**
     * <p>The minimum capacity for serverless autoscaling.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("ScaleMin")
    public Long scaleMin;

    /**
     * <p>The pre-purchased storage capacity in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("StorageQuota")
    public Long storageQuota;

    /**
     * <p>The storage type.</p>
     * 
     * <strong>example:</strong>
     * <p>OSS</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static ModifyDBInstanceClassShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceClassShrinkRequest self = new ModifyDBInstanceClassShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceClassShrinkRequest setAutoScaleConfigShrink(String autoScaleConfigShrink) {
        this.autoScaleConfigShrink = autoScaleConfigShrink;
        return this;
    }
    public String getAutoScaleConfigShrink() {
        return this.autoScaleConfigShrink;
    }

    public ModifyDBInstanceClassShrinkRequest setComputingGroupId(String computingGroupId) {
        this.computingGroupId = computingGroupId;
        return this;
    }
    public String getComputingGroupId() {
        return this.computingGroupId;
    }

    public ModifyDBInstanceClassShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceClassShrinkRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public ModifyDBInstanceClassShrinkRequest setNodeScaleMax(Integer nodeScaleMax) {
        this.nodeScaleMax = nodeScaleMax;
        return this;
    }
    public Integer getNodeScaleMax() {
        return this.nodeScaleMax;
    }

    public ModifyDBInstanceClassShrinkRequest setNodeScaleMin(Integer nodeScaleMin) {
        this.nodeScaleMin = nodeScaleMin;
        return this;
    }
    public Integer getNodeScaleMin() {
        return this.nodeScaleMin;
    }

    public ModifyDBInstanceClassShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBInstanceClassShrinkRequest setScaleMax(Long scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public Long getScaleMax() {
        return this.scaleMax;
    }

    public ModifyDBInstanceClassShrinkRequest setScaleMin(Long scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public Long getScaleMin() {
        return this.scaleMin;
    }

    public ModifyDBInstanceClassShrinkRequest setStorageQuota(Long storageQuota) {
        this.storageQuota = storageQuota;
        return this;
    }
    public Long getStorageQuota() {
        return this.storageQuota;
    }

    public ModifyDBInstanceClassShrinkRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
