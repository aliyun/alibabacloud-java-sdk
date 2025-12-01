// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class CancelChatResponseBody extends TeaModel {
    @NameInMap("CancelResult")
    public Boolean cancelResult;

    /**
     * <strong>example:</strong>
     * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelChatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelChatResponseBody self = new CancelChatResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelChatResponseBody setCancelResult(Boolean cancelResult) {
        this.cancelResult = cancelResult;
        return this;
    }
    public Boolean getCancelResult() {
        return this.cancelResult;
    }

    public CancelChatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
