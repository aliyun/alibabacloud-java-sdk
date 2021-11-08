// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DeleteIntentResponseBody extends TeaModel {
    @NameInMap("IntentId")
    public Long intentId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntentResponseBody self = new DeleteIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntentResponseBody setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public DeleteIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
