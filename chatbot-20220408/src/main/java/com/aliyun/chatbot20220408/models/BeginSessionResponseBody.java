// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class BeginSessionResponseBody extends TeaModel {
    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 欢迎语
    @NameInMap("WelcomeMessage")
    public String welcomeMessage;

    public static BeginSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeginSessionResponseBody self = new BeginSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public BeginSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BeginSessionResponseBody setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        return this;
    }
    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

}
