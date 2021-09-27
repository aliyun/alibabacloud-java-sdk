// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class UpdateProductVersionConfigRequest extends TeaModel {
    // 配置信息key
    @NameInMap("name")
    public String name;

    // 配置信息value
    @NameInMap("value")
    public String value;

    // 配置说明
    @NameInMap("description")
    public String description;

    // 子组件versinid
    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    // 父组件versionid
    @NameInMap("parentComponentVersionUID")
    public String parentComponentVersionUID;

    public static UpdateProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProductVersionConfigRequest self = new UpdateProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProductVersionConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateProductVersionConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UpdateProductVersionConfigRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateProductVersionConfigRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public UpdateProductVersionConfigRequest setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

}
