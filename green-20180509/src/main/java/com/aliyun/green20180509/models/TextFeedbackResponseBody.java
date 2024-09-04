// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class TextFeedbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TextFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TextFeedbackResponseBody self = new TextFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public TextFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
