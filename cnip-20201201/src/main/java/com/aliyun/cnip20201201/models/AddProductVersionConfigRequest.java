// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddProductVersionConfigRequest extends TeaModel {
    // 配置信息key
    @NameInMap("name")
    public String name;

    // 配置信息value
    @NameInMap("value")
    public String value;

    // 配置说明
    @NameInMap("notes")
    public String notes;

    // 组件uid
    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    // 父组件uid
    @NameInMap("ParentComponentVersionUID")
    public String parentComponentVersionUID;

    public static AddProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionConfigRequest self = new AddProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddProductVersionConfigRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddProductVersionConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AddProductVersionConfigRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public AddProductVersionConfigRequest setComponentVersionUID(String componentVersionUID) {
        this.componentVersionUID = componentVersionUID;
        return this;
    }
    public String getComponentVersionUID() {
        return this.componentVersionUID;
    }

    public AddProductVersionConfigRequest setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

}
