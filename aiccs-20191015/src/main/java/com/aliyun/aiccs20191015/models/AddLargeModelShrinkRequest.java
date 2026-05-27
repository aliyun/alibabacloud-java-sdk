// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class AddLargeModelShrinkRequest extends TeaModel {
    /**
     * <p>授权码</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>基础模型</p>
     */
    @NameInMap("BaseModel")
    public String baseModelShrink;

    /**
     * <p>模型名称</p>
     * 
     * <strong>example:</strong>
     * <p>Test Model Name</p>
     */
    @NameInMap("ModelName")
    public String modelName;

    /**
     * <p>模型地址</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
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
     * <p>温度</p>
     * 
     * <strong>example:</strong>
     * <p>16.46</p>
     */
    @NameInMap("Temperature")
    public Double temperature;

    /**
     * <p>topK</p>
     * 
     * <strong>example:</strong>
     * <p>87</p>
     */
    @NameInMap("TopK")
    public Long topK;

    /**
     * <p>topP</p>
     * 
     * <strong>example:</strong>
     * <p>73.64386</p>
     */
    @NameInMap("TopP")
    public Double topP;

    public static AddLargeModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLargeModelShrinkRequest self = new AddLargeModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddLargeModelShrinkRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public AddLargeModelShrinkRequest setBaseModelShrink(String baseModelShrink) {
        this.baseModelShrink = baseModelShrink;
        return this;
    }
    public String getBaseModelShrink() {
        return this.baseModelShrink;
    }

    public AddLargeModelShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public AddLargeModelShrinkRequest setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
        return this;
    }
    public String getModelUrl() {
        return this.modelUrl;
    }

    public AddLargeModelShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLargeModelShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddLargeModelShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddLargeModelShrinkRequest setTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }
    public Double getTemperature() {
        return this.temperature;
    }

    public AddLargeModelShrinkRequest setTopK(Long topK) {
        this.topK = topK;
        return this;
    }
    public Long getTopK() {
        return this.topK;
    }

    public AddLargeModelShrinkRequest setTopP(Double topP) {
        this.topP = topP;
        return this;
    }
    public Double getTopP() {
        return this.topP;
    }

}
