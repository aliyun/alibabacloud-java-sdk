// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class CreateIntentResponseBody extends TeaModel {
    @NameInMap("IntentId")
    public Long intentId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIntentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntentResponseBody self = new CreateIntentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntentResponseBody setIntentId(Long intentId) {
        this.intentId = intentId;
        return this;
    }
    public Long getIntentId() {
        return this.intentId;
    }

    public CreateIntentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
