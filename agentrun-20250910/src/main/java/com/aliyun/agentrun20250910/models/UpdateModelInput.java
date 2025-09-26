// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateModelInput extends TeaModel {
    @NameInMap("address")
    public String address;

    @NameInMap("apiKey")
    public String apiKey;

    @NameInMap("desc")
    public String desc;

    @NameInMap("models")
    public java.util.List<String> models;

    @NameInMap("name")
    public String name;

    @NameInMap("provider")
    public String provider;

    @NameInMap("type")
    public String type;

    public static UpdateModelInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateModelInput self = new UpdateModelInput();
        return TeaModel.build(map, self);
    }

    public UpdateModelInput setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateModelInput setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public UpdateModelInput setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateModelInput setModels(java.util.List<String> models) {
        this.models = models;
        return this;
    }
    public java.util.List<String> getModels() {
        return this.models;
    }

    public UpdateModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateModelInput setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public UpdateModelInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
