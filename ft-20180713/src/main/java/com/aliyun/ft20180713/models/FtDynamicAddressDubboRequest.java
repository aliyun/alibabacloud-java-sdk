// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressDubboRequest extends TeaModel {
    @NameInMap("IntValue")
    public Integer intValue;

    @NameInMap("StringValue")
    public String stringValue;

    public static FtDynamicAddressDubboRequest build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressDubboRequest self = new FtDynamicAddressDubboRequest();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressDubboRequest setIntValue(Integer intValue) {
        this.intValue = intValue;
        return this;
    }
    public Integer getIntValue() {
        return this.intValue;
    }

    public FtDynamicAddressDubboRequest setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

}
