// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class TestHttpApiShrinkRequest extends TeaModel {
    @NameInMap("BooleanParam")
    public Boolean booleanParam;

    @NameInMap("DefaultValue")
    public String defaultValueShrink;

    @NameInMap("OtherParam")
    public String otherParamShrink;

    @NameInMap("StringValue")
    public String stringValueShrink;

    public static TestHttpApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TestHttpApiShrinkRequest self = new TestHttpApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TestHttpApiShrinkRequest setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    public TestHttpApiShrinkRequest setDefaultValueShrink(String defaultValueShrink) {
        this.defaultValueShrink = defaultValueShrink;
        return this;
    }
    public String getDefaultValueShrink() {
        return this.defaultValueShrink;
    }

    public TestHttpApiShrinkRequest setOtherParamShrink(String otherParamShrink) {
        this.otherParamShrink = otherParamShrink;
        return this;
    }
    public String getOtherParamShrink() {
        return this.otherParamShrink;
    }

    public TestHttpApiShrinkRequest setStringValueShrink(String stringValueShrink) {
        this.stringValueShrink = stringValueShrink;
        return this;
    }
    public String getStringValueShrink() {
        return this.stringValueShrink;
    }

}
