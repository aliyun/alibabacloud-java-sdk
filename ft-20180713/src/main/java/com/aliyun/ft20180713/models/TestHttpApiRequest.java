// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestHttpApiRequest extends TeaModel {
    @NameInMap("StringValue")
    public java.util.Map<String, ?> stringValue;

    @NameInMap("DefaultValue")
    public java.util.Map<String, ?> defaultValue;

    @NameInMap("OtherParam")
    public java.util.Map<String, ?> otherParam;

    @NameInMap("BooleanParam")
    public Boolean booleanParam;

    public static TestHttpApiRequest build(java.util.Map<String, ?> map) throws Exception {
        TestHttpApiRequest self = new TestHttpApiRequest();
        return TeaModel.build(map, self);
    }

    public TestHttpApiRequest setStringValue(java.util.Map<String, ?> stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public java.util.Map<String, ?> getStringValue() {
        return this.stringValue;
    }

    public TestHttpApiRequest setDefaultValue(java.util.Map<String, ?> defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public java.util.Map<String, ?> getDefaultValue() {
        return this.defaultValue;
    }

    public TestHttpApiRequest setOtherParam(java.util.Map<String, ?> otherParam) {
        this.otherParam = otherParam;
        return this;
    }
    public java.util.Map<String, ?> getOtherParam() {
        return this.otherParam;
    }

    public TestHttpApiRequest setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

}
