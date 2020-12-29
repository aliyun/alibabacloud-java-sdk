// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressDubboResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StringValue")
    @Validation(required = true)
    public String stringValue;

    @NameInMap("IntValue")
    @Validation(required = true)
    public Integer intValue;

    public static FtDynamicAddressDubboResponse build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressDubboResponse self = new FtDynamicAddressDubboResponse();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressDubboResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FtDynamicAddressDubboResponse setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

    public FtDynamicAddressDubboResponse setIntValue(Integer intValue) {
        this.intValue = intValue;
        return this;
    }
    public Integer getIntValue() {
        return this.intValue;
    }

}
