// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class Model extends TeaModel {
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

    public static Model build(java.util.Map<String, ?> map) throws Exception {
        Model self = new Model();
        return TeaModel.build(map, self);
    }

    public Model setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public Model setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public Model setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Model setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public Model setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public Model setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Model setModels(String models) {
        this.models = models;
        return this;
    }
    public String getModels() {
        return this.models;
    }

    public Model setModelsWeight(String modelsWeight) {
        this.modelsWeight = modelsWeight;
        return this;
    }
    public String getModelsWeight() {
        return this.modelsWeight;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Model setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public Model setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

    public Model setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public Model setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Model setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
