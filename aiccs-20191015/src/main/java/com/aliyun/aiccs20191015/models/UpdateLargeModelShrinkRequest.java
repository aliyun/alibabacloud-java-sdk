// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateLargeModelShrinkRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-sxxxxx*********xx</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>A list of base models.</p>
     */
    @NameInMap("BaseModel")
    public String baseModelShrink;

    /**
     * <p>The model code.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Model Name</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test model</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxxx">https://xxxxxxxxx</a></p>
     */
    @NameInMap("ModelUrl")
    public String modelUrl;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Controls the randomness of the model\&quot;s output. A higher value increases randomness, and a lower value makes the output more deterministic.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("Temperature")
    public Double temperature;

    /**
     * <p>Restricts token selection to the top k most probable tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TopK")
    public Long topK;

    /**
     * <p>Controls output diversity by using nucleus sampling. It defines a cumulative probability threshold for token selection, considering only the most likely tokens.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("TopP")
    public Double topP;

    public static UpdateLargeModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLargeModelShrinkRequest self = new UpdateLargeModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLargeModelShrinkRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public UpdateLargeModelShrinkRequest setBaseModelShrink(String baseModelShrink) {
        this.baseModelShrink = baseModelShrink;
        return this;
    }
    public String getBaseModelShrink() {
        return this.baseModelShrink;
    }

    public UpdateLargeModelShrinkRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public UpdateLargeModelShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateLargeModelShrinkRequest setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
        return this;
    }
    public String getModelUrl() {
        return this.modelUrl;
    }

    public UpdateLargeModelShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLargeModelShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateLargeModelShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateLargeModelShrinkRequest setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    public Double getTemperature() {
        return this.temperature;
    }

    public UpdateLargeModelShrinkRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public UpdateLargeModelShrinkRequest setTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    public Double getTopP() {
        return this.topP;
    }

}
