// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAIStudioResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40A4F36D-A7CC-473A-88E7-154F92242566</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveAIStudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAIStudioResponseBody self = new DeleteLiveAIStudioResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAIStudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
