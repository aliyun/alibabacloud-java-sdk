// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class CuaChatCompletionStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>request-20260918-001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CuaChatCompletionStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CuaChatCompletionStreamResponseBody self = new CuaChatCompletionStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public CuaChatCompletionStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
