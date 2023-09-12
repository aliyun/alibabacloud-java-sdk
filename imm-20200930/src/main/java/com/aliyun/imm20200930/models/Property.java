// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Property extends TeaModel {
    @NameInMap("ItemsType")
    public String itemsType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    @NameInMap("ValueType")
    public String valueType;

    public static Property build(java.util.Map<String, ?> map) throws Exception {
        Property self = new Property();
        return TeaModel.build(map, self);
    }

    public Property setItemsType(String itemsType) {
        this.itemsType = itemsType;
        return this;
    }
    public String getItemsType() {
        return this.itemsType;
    }

    public Property setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Property setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public Property setValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }
    public String getValueType() {
        return this.valueType;
    }

}
