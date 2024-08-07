// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateFaqResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>736994BD-AA35-4742-88C9-E64BE4BAA14B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateFaqResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaqResponseBody self = new UpdateFaqResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFaqResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
