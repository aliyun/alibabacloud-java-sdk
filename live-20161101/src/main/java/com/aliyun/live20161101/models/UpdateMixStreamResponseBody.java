// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMixStreamResponseBody extends TeaModel {
    /**
     * <p>The ID of the stream mixing task. You can specify this parameter in a request to delete the stream mixing task or query stream mixing tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>5b2a046e-74d7-385e-d2d7-8a5b87e4****</p>
     */
    @NameInMap("MixStreamId")
    public String mixStreamId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1A8CDDFF-0121-4ABB-DA60-AEF095A8W34F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMixStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMixStreamResponseBody self = new UpdateMixStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMixStreamResponseBody setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    public UpdateMixStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
