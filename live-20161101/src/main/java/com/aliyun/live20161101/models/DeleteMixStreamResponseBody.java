// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMixStreamResponseBody extends TeaModel {
    /**
     * <p>The ID of the stream mixing task.</p>
     * 
     * <strong>example:</strong>
     * <p>749b7594-86d6-37b1-513b-e1e19845****</p>
     */
    @NameInMap("MixStreamId")
    public String mixStreamId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BE9407FF-F897-4DBD-338D-98A750AD805F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMixStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMixStreamResponseBody self = new DeleteMixStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMixStreamResponseBody setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

    public DeleteMixStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
