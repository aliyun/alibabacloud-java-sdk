// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maasqiservice20260831.models;

import com.aliyun.tea.*;

public class GuiChatCompletionStreamResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static GuiChatCompletionStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GuiChatCompletionStreamResponseBody self = new GuiChatCompletionStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public GuiChatCompletionStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
