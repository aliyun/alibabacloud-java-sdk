// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Column extends TeaModel {
    @NameInMap("IsNull")
    public Boolean isNull;

    @NameInMap("Name")
    public String name;

    @NameInMap("Type")
    public String type;

    @NameInMap("Value")
    public String value;

    public static Column build(java.util.Map<String, ?> map) throws Exception {
        Column self = new Column();
        return TeaModel.build(map, self);
    }

    public Column setIsNull(Boolean isNull) {
        this.isNull = isNull;
        return this;
    }
    public Boolean getIsNull() {
        return this.isNull;
    }

    public Column setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Column setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public Column setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
