// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressHttpVpcRequest extends TeaModel {
    @NameInMap("StringValue")
    public java.util.Map<String, ?> stringValue;

    @NameInMap("DefaultValue")
    public java.util.Map<String, ?> defaultValue;

    @NameInMap("OtherParam")
    public java.util.Map<String, ?> otherParam;

    @NameInMap("BooleanParam")
    public Boolean booleanParam;

    @NameInMap("P1")
    public String p1;

    public static FtDynamicAddressHttpVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressHttpVpcRequest self = new FtDynamicAddressHttpVpcRequest();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressHttpVpcRequest setStringValue(java.util.Map<String, ?> stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public java.util.Map<String, ?> getStringValue() {
        return this.stringValue;
    }

    public FtDynamicAddressHttpVpcRequest setDefaultValue(java.util.Map<String, ?> defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public java.util.Map<String, ?> getDefaultValue() {
        return this.defaultValue;
    }

    public FtDynamicAddressHttpVpcRequest setOtherParam(java.util.Map<String, ?> otherParam) {
        this.otherParam = otherParam;
        return this;
    }
    public java.util.Map<String, ?> getOtherParam() {
        return this.otherParam;
    }

    public FtDynamicAddressHttpVpcRequest setBooleanParam(Boolean booleanParam) {
        this.booleanParam = booleanParam;
        return this;
    }
    public Boolean getBooleanParam() {
        return this.booleanParam;
    }

    public FtDynamicAddressHttpVpcRequest setP1(String p1) {
        this.p1 = p1;
        return this;
    }
    public String getP1() {
        return this.p1;
    }

}
