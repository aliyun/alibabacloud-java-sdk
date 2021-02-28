// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteBotResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBotResponseBody self = new DeleteBotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
