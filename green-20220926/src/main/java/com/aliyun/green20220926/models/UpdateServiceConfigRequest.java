// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateServiceConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("FileConfig")
    public String fileConfig;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("KeywordFilterLibs")
    public String keywordFilterLibs;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("KeywordHitLibs")
    public String keywordHitLibs;

    @NameInMap("ManualMachineConfig")
    public String manualMachineConfig;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>pornographic</p>
     */
    @NameInMap("Scene")
    public String scene;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("SceneConfig")
    public String sceneConfig;

    /**
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("VideoConfig")
    public String videoConfig;

    public static UpdateServiceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceConfigRequest self = new UpdateServiceConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceConfigRequest setFileConfig(String fileConfig) {
        this.fileConfig = fileConfig;
        return this;
    }
    public String getFileConfig() {
        return this.fileConfig;
    }

    public UpdateServiceConfigRequest setKeywordFilterLibs(String keywordFilterLibs) {
        this.keywordFilterLibs = keywordFilterLibs;
        return this;
    }
    public String getKeywordFilterLibs() {
        return this.keywordFilterLibs;
    }

    public UpdateServiceConfigRequest setKeywordHitLibs(String keywordHitLibs) {
        this.keywordHitLibs = keywordHitLibs;
        return this;
    }
    public String getKeywordHitLibs() {
        return this.keywordHitLibs;
    }

    public UpdateServiceConfigRequest setManualMachineConfig(String manualMachineConfig) {
        this.manualMachineConfig = manualMachineConfig;
        return this;
    }
    public String getManualMachineConfig() {
        return this.manualMachineConfig;
    }

    public UpdateServiceConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateServiceConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateServiceConfigRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateServiceConfigRequest setSceneConfig(String sceneConfig) {
        this.sceneConfig = sceneConfig;
        return this;
    }
    public String getSceneConfig() {
        return this.sceneConfig;
    }

    public UpdateServiceConfigRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public UpdateServiceConfigRequest setVideoConfig(String videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }
    public String getVideoConfig() {
        return this.videoConfig;
    }

}
