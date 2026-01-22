// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class FieldOption extends TeaModel {
    @NameInMap("FunctionCode")
    public String functionCode;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    public static FieldOption build(java.util.Map<String, ?> map) throws Exception {
        FieldOption self = new FieldOption();
        return TeaModel.build(map, self);
    }

    public FieldOption setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
        return this;
    }
    public String getFunctionCode() {
        return this.functionCode;
    }

    public FieldOption setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public FieldOption setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FieldOption setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
