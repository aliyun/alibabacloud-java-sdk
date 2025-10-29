// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateApigLLMModelInput extends TeaModel {
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

    public static CreateApigLLMModelInput build(java.util.Map<String, ?> map) throws Exception {
        CreateApigLLMModelInput self = new CreateApigLLMModelInput();
        return TeaModel.build(map, self);
    }

    public CreateApigLLMModelInput setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateApigLLMModelInput setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateApigLLMModelInput setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateApigLLMModelInput setModels(java.util.List<String> models) {
        this.models = models;
        return this;
    }
    public java.util.List<String> getModels() {
        return this.models;
    }

    public CreateApigLLMModelInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApigLLMModelInput setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateApigLLMModelInput setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
