// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class SendBizCocChangeCallbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SendBizCocChangeCallbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendBizCocChangeCallbackResponseBody self = new SendBizCocChangeCallbackResponseBody();
        return TeaModel.build(map, self);
    }

    public SendBizCocChangeCallbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
