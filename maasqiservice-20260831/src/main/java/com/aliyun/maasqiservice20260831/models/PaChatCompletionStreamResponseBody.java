// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class PaChatCompletionStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static PaChatCompletionStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PaChatCompletionStreamResponseBody self = new PaChatCompletionStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public PaChatCompletionStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
