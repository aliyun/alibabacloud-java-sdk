// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductVersionConfigRequest extends TeaModel {
    // 组件uid
    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    // 配置说明
    @NameInMap("description")
    public String description;

    // 配置信息key
    @NameInMap("name")
    public String name;

    // 父组件uid
    @NameInMap("parentComponentVersionUID")
    public String parentComponentVersionUID;

    // 配置信息value
    @NameInMap("value")
    public String value;

    public static AddProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionConfigRequest self = new AddProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddProductVersionConfigRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public AddProductVersionConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddProductVersionConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddProductVersionConfigRequest setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    public AddProductVersionConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
