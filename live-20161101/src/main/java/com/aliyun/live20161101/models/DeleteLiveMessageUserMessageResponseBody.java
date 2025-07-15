// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveMessageUserMessageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6CFDE7AB-571A-14EA-B072-989FF753****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveMessageUserMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveMessageUserMessageResponseBody self = new DeleteLiveMessageUserMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveMessageUserMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
