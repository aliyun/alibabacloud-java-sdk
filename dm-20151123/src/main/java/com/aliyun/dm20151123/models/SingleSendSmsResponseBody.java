// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SingleSendSmsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SingleSendSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleSendSmsResponseBody self = new SingleSendSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleSendSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
