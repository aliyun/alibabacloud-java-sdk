// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class KickLiveMessageGroupUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>97168878-5288-10CE-AE56-E2D1627FB5F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static KickLiveMessageGroupUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KickLiveMessageGroupUserResponseBody self = new KickLiveMessageGroupUserResponseBody();
        return TeaModel.build(map, self);
    }

    public KickLiveMessageGroupUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
