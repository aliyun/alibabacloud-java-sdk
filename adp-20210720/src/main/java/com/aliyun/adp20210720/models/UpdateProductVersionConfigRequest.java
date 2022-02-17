// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductVersionConfigRequest extends TeaModel {
    // 子组件versinid
    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    // 配置说明
    @NameInMap("description")
    public String description;

    // 配置信息key
    @NameInMap("name")
    public String name;

    // 父组件versionid
    @NameInMap("parentComponentVersionUID")
    public String parentComponentVersionUID;

    // 配置信息value
    @NameInMap("value")
    public String value;

    // value类型
    @NameInMap("valueType")
    public String valueType;

    public static UpdateProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionConfigRequest self = new UpdateProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionConfigRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public UpdateProductVersionConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductVersionConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProductVersionConfigRequest setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    public UpdateProductVersionConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UpdateProductVersionConfigRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
