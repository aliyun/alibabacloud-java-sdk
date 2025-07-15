// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMixStreamResponseBody extends TeaModel {
    /**
     * <p>The ID of the stream mixing task. You can specify this parameter in a request to delete the stream mixing task or query stream mixing tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>5b2a046e-74d7-385e-253f-8a5b87e4****</p>
     */
    @NameInMap("MixStreamId")
    public String mixStreamId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0D715397-2E66-4AE1-694h-C546628AD145</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMixStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMixStreamResponseBody self = new CreateMixStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMixStreamResponseBody setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    public CreateMixStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
