// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatStreamResponseBody extends TeaModel {
    /**
     * <p>Q&amp;A content.</p>
     */
    @NameInMap("data")
    public ChatItem data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ChatStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatStreamResponseBody self = new ChatStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatStreamResponseBody setData(ChatItem data) {
        this.data = data;
        return this;
    }
    public ChatItem getData() {
        return this.data;
    }

    public ChatStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
