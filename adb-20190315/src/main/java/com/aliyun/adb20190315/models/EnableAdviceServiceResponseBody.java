// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class EnableAdviceServiceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static EnableAdviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableAdviceServiceResponseBody self = new EnableAdviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableAdviceServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnableAdviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
