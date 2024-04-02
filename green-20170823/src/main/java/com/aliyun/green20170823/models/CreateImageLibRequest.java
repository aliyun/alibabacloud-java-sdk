// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateImageLibRequest extends TeaModel {
    @NameInMap("BizTypes")
    public String bizTypes;

    @NameInMap("Category")
    public String category;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Name")
    public String name;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("ServiceModule")
    public String serviceModule;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageLibRequest self = new CreateImageLibRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageLibRequest setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
        return this;
    }
    public String getBizTypes() {
        return this.bizTypes;
    }

    public CreateImageLibRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateImageLibRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateImageLibRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateImageLibRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateImageLibRequest setServiceModule(String serviceModule) {
        this.serviceModule = serviceModule;
        return this;
    }
    public String getServiceModule() {
        return this.serviceModule;
    }

    public CreateImageLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
