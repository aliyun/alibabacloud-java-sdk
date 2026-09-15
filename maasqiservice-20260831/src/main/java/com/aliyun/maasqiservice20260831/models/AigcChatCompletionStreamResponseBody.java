// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class AigcChatCompletionStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static AigcChatCompletionStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AigcChatCompletionStreamResponseBody self = new AigcChatCompletionStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public AigcChatCompletionStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
