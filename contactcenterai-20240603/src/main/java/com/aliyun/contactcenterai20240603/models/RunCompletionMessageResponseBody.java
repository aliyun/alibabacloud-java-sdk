// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class RunCompletionMessageResponseBody extends TeaModel {
    @NameInMap("FinishReason")
    public String finishReason;

    /**
     * <strong>example:</strong>
     * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Text")
    public String text;

    public static RunCompletionMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionMessageResponseBody self = new RunCompletionMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public RunCompletionMessageResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public RunCompletionMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunCompletionMessageResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
