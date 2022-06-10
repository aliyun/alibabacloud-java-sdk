// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateIntentResponseBody extends TeaModel {
    @NameInMap("IntentId")
    public Long intentId;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntentResponseBody self = new UpdateIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIntentResponseBody setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public UpdateIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
