// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class StandardComponentsValue extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("version")
    public String version;

    @NameInMap("description")
    public String description;

    @NameInMap("required")
    public String required;

    @NameInMap("disabled")
    public Boolean disabled;

    public static StandardComponentsValue build(java.util.Map<String, ?> map) throws Exception {
        StandardComponentsValue self = new StandardComponentsValue();
        return TeaModel.build(map, self);
    }

    public StandardComponentsValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public StandardComponentsValue setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public StandardComponentsValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public StandardComponentsValue setRequired(String required) {
        this.required = required;
        return this;
    }
    public String getRequired() {
        return this.required;
    }

    public StandardComponentsValue setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }
    public Boolean getDisabled() {
        return this.disabled;
    }

}
