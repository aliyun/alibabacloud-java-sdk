// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ContextSchema extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("hint")
    public String hint;

    @NameInMap("name")
    public String name;

    @NameInMap("required")
    public Boolean required;

    @NameInMap("type")
    public String type;

    public static ContextSchema build(java.util.Map<String, ?> map) throws Exception {
        ContextSchema self = new ContextSchema();
        return TeaModel.build(map, self);
    }

    public ContextSchema setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ContextSchema setHint(String hint) {
        this.hint = hint;
        return this;
    }
    public String getHint() {
        return this.hint;
    }

    public ContextSchema setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContextSchema setRequired(Boolean required) {
        this.required = required;
        return this;
    }
    public Boolean getRequired() {
        return this.required;
    }

    public ContextSchema setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
