// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UpdateIntentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("IntentId")
    public String intentId;

    public static UpdateIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntentResponseBody self = new UpdateIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateIntentResponseBody setIntentId(String intentId) {
        this.intentId = intentId;
        return this;
    }
    public String getIntentId() {
        return this.intentId;
    }

}
