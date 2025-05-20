// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class FullDataType extends TeaModel {
    @NameInMap("element")
    public FullDataType element;

    @NameInMap("fields")
    public java.util.List<DataField> fields;

    @NameInMap("key")
    public FullDataType key;

    @NameInMap("type")
    public String type;

    @NameInMap("value")
    public FullDataType value;

    public static FullDataType build(java.util.Map<String, ?> map) throws Exception {
        FullDataType self = new FullDataType();
        return TeaModel.build(map, self);
    }

    public FullDataType setElement(FullDataType element) {
        this.element = element;
        return this;
    }
    public FullDataType getElement() {
        return this.element;
    }

    public FullDataType setFields(java.util.List<DataField> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<DataField> getFields() {
        return this.fields;
    }

    public FullDataType setKey(FullDataType key) {
        this.key = key;
        return this;
    }
    public FullDataType getKey() {
        return this.key;
    }

    public FullDataType setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FullDataType setValue(FullDataType value) {
        this.value = value;
        return this;
    }
    public FullDataType getValue() {
        return this.value;
    }

}
