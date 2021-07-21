// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddEnvChangeRequest extends TeaModel {
    // 原版本号
    @NameInMap("originProductVersion")
    public String originProductVersion;

    // 原版本uid
    @NameInMap("originProductVersionUID")
    public String originProductVersionUID;

    // 发布版本
    @NameInMap("deliveryProductVersion")
    public String deliveryProductVersion;

    // 发布版本uid
    @NameInMap("deliveryProductVersionUID")
    public String deliveryProductVersionUID;

    // 交付描述
    @NameInMap("description")
    public String description;

    public static AddEnvChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEnvChangeRequest self = new AddEnvChangeRequest();
        return TeaModel.build(map, self);
    }

    public AddEnvChangeRequest setOriginProductVersion(String originProductVersion) {
        this.originProductVersion = originProductVersion;
        return this;
    }
    public String getOriginProductVersion() {
        return this.originProductVersion;
    }

    public AddEnvChangeRequest setOriginProductVersionUID(String originProductVersionUID) {
        this.originProductVersionUID = originProductVersionUID;
        return this;
    }
    public String getOriginProductVersionUID() {
        return this.originProductVersionUID;
    }

    public AddEnvChangeRequest setDeliveryProductVersion(String deliveryProductVersion) {
        this.deliveryProductVersion = deliveryProductVersion;
        return this;
    }
    public String getDeliveryProductVersion() {
        return this.deliveryProductVersion;
    }

    public AddEnvChangeRequest setDeliveryProductVersionUID(String deliveryProductVersionUID) {
        this.deliveryProductVersionUID = deliveryProductVersionUID;
        return this;
    }
    public String getDeliveryProductVersionUID() {
        return this.deliveryProductVersionUID;
    }

    public AddEnvChangeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
