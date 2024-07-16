// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class UpdateBatchOperateCardsTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>boct-xxxx</p>
     */
    @NameInMap("BatchOperateCardsTaskId")
    public String batchOperateCardsTaskId;

    /**
     * <strong>example:</strong>
     * <p>TF-******-1633255280-43c94bf7-2dd3-4c14-8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>task-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <strong>example:</strong>
     * <p>CurrentMonth</p>
     */
    @NameInMap("EffectType")
    public String effectType;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    @NameInMap("IccidsOssFilePath")
    public String iccidsOssFilePath;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>BreakNetwork</p>
     */
    @NameInMap("OperateType")
    public String operateType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Threshold")
    public Long threshold;

    @NameInMap("WirelessCloudConnectorIds")
    public java.util.List<String> wirelessCloudConnectorIds;

    public static UpdateBatchOperateCardsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchOperateCardsTaskRequest self = new UpdateBatchOperateCardsTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBatchOperateCardsTaskRequest setBatchOperateCardsTaskId(String batchOperateCardsTaskId) {
        this.batchOperateCardsTaskId = batchOperateCardsTaskId;
        return this;
    }
    public String getBatchOperateCardsTaskId() {
        return this.batchOperateCardsTaskId;
    }

    public UpdateBatchOperateCardsTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateBatchOperateCardsTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateBatchOperateCardsTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateBatchOperateCardsTaskRequest setEffectType(String effectType) {
        this.effectType = effectType;
        return this;
    }
    public String getEffectType() {
        return this.effectType;
    }

    public UpdateBatchOperateCardsTaskRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public UpdateBatchOperateCardsTaskRequest setIccidsOssFilePath(String iccidsOssFilePath) {
        this.iccidsOssFilePath = iccidsOssFilePath;
        return this;
    }
    public String getIccidsOssFilePath() {
        return this.iccidsOssFilePath;
    }

    public UpdateBatchOperateCardsTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateBatchOperateCardsTaskRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public UpdateBatchOperateCardsTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateBatchOperateCardsTaskRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public UpdateBatchOperateCardsTaskRequest setWirelessCloudConnectorIds(java.util.List<String> wirelessCloudConnectorIds) {
        this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

}
