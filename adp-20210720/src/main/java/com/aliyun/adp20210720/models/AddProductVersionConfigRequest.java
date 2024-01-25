// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class AddProductVersionConfigRequest extends TeaModel {
    @NameInMap("componentReleaseName")
    public String componentReleaseName;

    @NameInMap("componentVersionUID")
    public String componentVersionUID;

    @NameInMap("description")
    public String description;

    @NameInMap("name")
    public String name;

    @NameInMap("parentComponentReleaseName")
    public String parentComponentReleaseName;

    @NameInMap("parentComponentVersionUID")
    public String parentComponentVersionUID;

    @NameInMap("scope")
    public String scope;

    @NameInMap("value")
    public String value;

    @NameInMap("valueType")
    public String valueType;

    public static AddProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductVersionConfigRequest self = new AddProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddProductVersionConfigRequest setComponentReleaseName(String componentReleaseName) {
        this.componentReleaseName = componentReleaseName;
        return this;
    }
    public String getComponentReleaseName() {
        return this.componentReleaseName;
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

    public AddProductVersionConfigRequest setParentComponentReleaseName(String parentComponentReleaseName) {
        this.parentComponentReleaseName = parentComponentReleaseName;
        return this;
    }
    public String getParentComponentReleaseName() {
        return this.parentComponentReleaseName;
    }

    public AddProductVersionConfigRequest setParentComponentVersionUID(String parentComponentVersionUID) {
        this.parentComponentVersionUID = parentComponentVersionUID;
        return this;
    }
    public String getParentComponentVersionUID() {
        return this.parentComponentVersionUID;
    }

    public AddProductVersionConfigRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public AddProductVersionConfigRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AddProductVersionConfigRequest setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
