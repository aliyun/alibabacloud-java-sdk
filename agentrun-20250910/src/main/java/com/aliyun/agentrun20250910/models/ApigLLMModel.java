// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ApigLLMModel extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("apiKey")
    public String apiKey;

    @NameInMap("createdTime")
    public String createdTime;

    @NameInMap("desc")
    public String desc;

    @NameInMap("gatewayId")
    public String gatewayId;

    @NameInMap("modelId")
    public String modelId;

    @NameInMap("models")
    public String models;

    @NameInMap("modelsWeight")
    public String modelsWeight;

    @NameInMap("name")
    public String name;

    @NameInMap("provider")
    public String provider;

    @NameInMap("targetId")
    public String targetId;

    @NameInMap("tenantId")
    public String tenantId;

    @NameInMap("type")
    public String type;

    @NameInMap("updateTime")
    public String updateTime;

    public static ApigLLMModel build(java.util.Map<String, ?> map) throws Exception {
        ApigLLMModel self = new ApigLLMModel();
        return TeaModel.build(map, self);
    }

    public ApigLLMModel setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ApigLLMModel setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public ApigLLMModel setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public ApigLLMModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public ApigLLMModel setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ApigLLMModel setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public ApigLLMModel setModels(String models) {
        this.models = models;
        return this;
    }
    public String getModels() {
        return this.models;
    }

    public ApigLLMModel setModelsWeight(String modelsWeight) {
        this.modelsWeight = modelsWeight;
        return this;
    }
    public String getModelsWeight() {
        return this.modelsWeight;
    }

    public ApigLLMModel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApigLLMModel setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ApigLLMModel setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public ApigLLMModel setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApigLLMModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApigLLMModel setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
