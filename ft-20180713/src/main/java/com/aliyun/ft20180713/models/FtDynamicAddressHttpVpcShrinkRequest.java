// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressHttpVpcShrinkRequest extends TeaModel {
    @NameInMap("StringValue")
    public String stringValueShrink;

    @NameInMap("DefaultValue")
    public String defaultValueShrink;

    @NameInMap("OtherParam")
    public String otherParamShrink;

    @NameInMap("BooleanParam")
    public Boolean booleanParam;

    @NameInMap("P1")
    public String p1;

    public static FtDynamicAddressHttpVpcShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressHttpVpcShrinkRequest self = new FtDynamicAddressHttpVpcShrinkRequest();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressHttpVpcShrinkRequest setStringValueShrink(String stringValueShrink) {
        this.stringValueShrink = stringValueShrink;
        return this;
    }
    public String getStringValueShrink() {
        return this.stringValueShrink;
    }

    public FtDynamicAddressHttpVpcShrinkRequest setDefaultValueShrink(String defaultValueShrink) {
        this.defaultValueShrink = defaultValueShrink;
        return this;
    }
    public String getDefaultValueShrink() {
        return this.defaultValueShrink;
    }

    public FtDynamicAddressHttpVpcShrinkRequest setOtherParamShrink(String otherParamShrink) {
        this.otherParamShrink = otherParamShrink;
        return this;
    }
    public String getOtherParamShrink() {
        return this.otherParamShrink;
    }

    public FtDynamicAddressHttpVpcShrinkRequest setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    public FtDynamicAddressHttpVpcShrinkRequest setP1(String p1) {
        this.p1 = p1;
        return this;
    }
    public String getP1() {
        return this.p1;
    }

}
