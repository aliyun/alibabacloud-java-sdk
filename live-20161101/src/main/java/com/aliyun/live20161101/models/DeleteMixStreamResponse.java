// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMixStreamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MixStreamId")
    @Validation(required = true)
    public String mixStreamId;

    public static DeleteMixStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMixStreamResponse self = new DeleteMixStreamResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMixStreamResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMixStreamResponse setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

}
