// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DisableAdviceServiceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DisableAdviceServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableAdviceServiceResponseBody self = new DisableAdviceServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableAdviceServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableAdviceServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
