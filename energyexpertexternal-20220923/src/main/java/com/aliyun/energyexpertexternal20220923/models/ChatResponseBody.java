// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatResponseBody extends TeaModel {
    /**
     * <p>Details of the Q&amp;A.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public static ChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatResponseBody self = new ChatResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatResponseBody setData(ChatItem data) {
        this.data = data;
        return this;
    }
    public ChatItem getData() {
        return this.data;
    }

    public ChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
