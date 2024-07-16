// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class CreateBatchOperateCardsTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>TF-******-1633255280-43c94bf7-2dd3-4c14-8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>task- test</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CurrentMonth</p>
     */
    @NameInMap("EffectType")
    public String effectType;

    @NameInMap("Iccids")
    public java.util.List<String> iccids;

    /**
     * <strong>example:</strong>
     * <p><a href="https://examplebucket.oss-eu-central-1.aliyuncs.com/">https://examplebucket.oss-eu-central-1.aliyuncs.com/</a>***</p>
     */
    @NameInMap("IccidsOssFilePath")
    public String iccidsOssFilePath;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Threshold")
    public Long threshold;

    @NameInMap("WirelessCloudConnectorIds")
    public java.util.List<String> wirelessCloudConnectorIds;

    public static CreateBatchOperateCardsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBatchOperateCardsTaskRequest self = new CreateBatchOperateCardsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateBatchOperateCardsTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateBatchOperateCardsTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateBatchOperateCardsTaskRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateBatchOperateCardsTaskRequest setEffectType(String effectType) {
        this.effectType = effectType;
        return this;
    }
    public String getEffectType() {
        return this.effectType;
    }

    public CreateBatchOperateCardsTaskRequest setIccids(java.util.List<String> iccids) {
        this.iccids = iccids;
        return this;
    }
    public java.util.List<String> getIccids() {
        return this.iccids;
    }

    public CreateBatchOperateCardsTaskRequest setIccidsOssFilePath(String iccidsOssFilePath) {
        this.iccidsOssFilePath = iccidsOssFilePath;
        return this;
    }
    public String getIccidsOssFilePath() {
        return this.iccidsOssFilePath;
    }

    public CreateBatchOperateCardsTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBatchOperateCardsTaskRequest setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public CreateBatchOperateCardsTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateBatchOperateCardsTaskRequest setThreshold(Long threshold) {
        this.threshold = threshold;
        return this;
    }
    public Long getThreshold() {
        return this.threshold;
    }

    public CreateBatchOperateCardsTaskRequest setWirelessCloudConnectorIds(java.util.List<String> wirelessCloudConnectorIds) {
        this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
        return this;
    }
    public java.util.List<String> getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

}
