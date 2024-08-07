// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CreateIntentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>43546474</p>
     */
    @NameInMap("IntentId")
    public Long intentId;

    /**
     * <strong>example:</strong>
     * <p>df56gjh5et34g3g3</p>
     */
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
