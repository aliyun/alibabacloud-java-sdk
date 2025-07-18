// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpCustomField extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Key")
    public String key;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("Value")
    public String value;

    public static IdpCustomField build(java.util.Map<String, ?> map) throws Exception {
        IdpCustomField self = new IdpCustomField();
        return TeaModel.build(map, self);
    }

    public IdpCustomField setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public IdpCustomField setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public IdpCustomField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IdpCustomField setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public IdpCustomField setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
