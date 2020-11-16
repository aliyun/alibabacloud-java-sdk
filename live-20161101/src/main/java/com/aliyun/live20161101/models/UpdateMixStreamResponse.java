// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMixStreamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MixStreamId")
    @Validation(required = true)
    public String mixStreamId;

    public static UpdateMixStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMixStreamResponse self = new UpdateMixStreamResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMixStreamResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMixStreamResponse setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

}
