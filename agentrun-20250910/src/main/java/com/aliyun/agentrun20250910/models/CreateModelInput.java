// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateModelInput extends TeaModel {
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

    public static CreateModelInput build(java.util.Map<String, ?> map) throws Exception {
        CreateModelInput self = new CreateModelInput();
        return TeaModel.build(map, self);
    }

    public CreateModelInput setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateModelInput setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateModelInput setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateModelInput setModels(java.util.List<String> models) {
        this.models = models;
        return this;
    }
    public java.util.List<String> getModels() {
        return this.models;
    }

    public CreateModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateModelInput setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateModelInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
