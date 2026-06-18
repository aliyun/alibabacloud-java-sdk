// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddLargeModelRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * 
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxx*******xx</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>The base model.</p>
     */
    @NameInMap("BaseModel")
    public java.util.List<String> baseModel;

    /**
     * <p>The model name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test Model Name</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>The model URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxxxxxxxxxx">https://xxxxxxxxxxx</a></p>
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
     * <p>The temperature.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("Temperature")
    public Double temperature;

    /**
     * <p>The <code>top-k</code> value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TopK")
    public Long topK;

    /**
     * <p>The <code>top-p</code> value.</p>
     * 
     * <strong>example:</strong>
     * <p>0.1</p>
     */
    @NameInMap("TopP")
    public Double topP;

    public static AddLargeModelRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLargeModelRequest self = new AddLargeModelRequest();
        return TeaModel.build(map, self);
    }

    public AddLargeModelRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AddLargeModelRequest setBaseModel(java.util.List<String> baseModel) {
        this.baseModel = baseModel;
        return this;
    }
    public java.util.List<String> getBaseModel() {
        return this.baseModel;
    }

    public AddLargeModelRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AddLargeModelRequest setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
        return this;
    }
    public String getModelUrl() {
        return this.modelUrl;
    }

    public AddLargeModelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLargeModelRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddLargeModelRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddLargeModelRequest setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    public Double getTemperature() {
        return this.temperature;
    }

    public AddLargeModelRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public AddLargeModelRequest setTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    public Double getTopP() {
        return this.topP;
    }

}
