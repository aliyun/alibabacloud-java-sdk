// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtDynamicAddressDubboResponseBody extends TeaModel {
    @NameInMap("IntValue")
    public Integer intValue;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StringValue")
    public String stringValue;

    public static FtDynamicAddressDubboResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FtDynamicAddressDubboResponseBody self = new FtDynamicAddressDubboResponseBody();
        return TeaModel.build(map, self);
    }

    public FtDynamicAddressDubboResponseBody setIntValue(Integer intValue) {
        this.intValue = intValue;
        return this;
    }
    public Integer getIntValue() {
        return this.intValue;
    }

    public FtDynamicAddressDubboResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FtDynamicAddressDubboResponseBody setStringValue(String stringValue) {
        this.stringValue = stringValue;
        return this;
    }
    public String getStringValue() {
        return this.stringValue;
    }

}
