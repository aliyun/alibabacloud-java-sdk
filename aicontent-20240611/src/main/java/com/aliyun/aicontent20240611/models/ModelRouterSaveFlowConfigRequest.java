// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSaveFlowConfigRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607</p>
     */
    @NameInMap("modelId")
    public Integer modelId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("rpm")
    public Integer rpm;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("smoothFlowEnabled")
    public Boolean smoothFlowEnabled;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tpm")
    public Integer tpm;

    public static ModelRouterSaveFlowConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSaveFlowConfigRequest self = new ModelRouterSaveFlowConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterSaveFlowConfigRequest setModelId(Integer modelId) {
        this.modelId = modelId;
        return this;
    }
    public Integer getModelId() {
        return this.modelId;
    }

    public ModelRouterSaveFlowConfigRequest setRpm(Integer rpm) {
        this.rpm = rpm;
        return this;
    }
    public Integer getRpm() {
        return this.rpm;
    }

    public ModelRouterSaveFlowConfigRequest setSmoothFlowEnabled(Boolean smoothFlowEnabled) {
        this.smoothFlowEnabled = smoothFlowEnabled;
        return this;
    }
    public Boolean getSmoothFlowEnabled() {
        return this.smoothFlowEnabled;
    }

    public ModelRouterSaveFlowConfigRequest setTpm(Integer tpm) {
        this.tpm = tpm;
        return this;
    }
    public Integer getTpm() {
        return this.tpm;
    }

}
