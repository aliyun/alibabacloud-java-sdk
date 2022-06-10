// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class UpdateFaqResponseBody extends TeaModel {
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
