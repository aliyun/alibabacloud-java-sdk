// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAISubtitleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveAISubtitleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAISubtitleResponseBody self = new DeleteLiveAISubtitleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAISubtitleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
