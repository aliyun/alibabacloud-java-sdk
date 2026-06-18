// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class UpdateLargeModelRequest extends TeaModel {
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
    public java.util.List<String> baseModel;

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

    public static UpdateLargeModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLargeModelRequest self = new UpdateLargeModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLargeModelRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public UpdateLargeModelRequest setBaseModel(java.util.List<String> baseModel) {
        this.baseModel = baseModel;
        return this;
    }
    public java.util.List<String> getBaseModel() {
        return this.baseModel;
    }

    public UpdateLargeModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public UpdateLargeModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public UpdateLargeModelRequest setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
        return this;
    }
    public String getModelUrl() {
        return this.modelUrl;
    }

    public UpdateLargeModelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateLargeModelRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateLargeModelRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateLargeModelRequest setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    public Double getTemperature() {
        return this.temperature;
    }

    public UpdateLargeModelRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public UpdateLargeModelRequest setTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    public Double getTopP() {
        return this.topP;
    }

}
