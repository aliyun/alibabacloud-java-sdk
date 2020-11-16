// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMixStreamResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MixStreamId")
    @Validation(required = true)
    public String mixStreamId;

    public static CreateMixStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMixStreamResponse self = new CreateMixStreamResponse();
        return TeaModel.build(map, self);
    }

    public CreateMixStreamResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMixStreamResponse setMixStreamId(String mixStreamId) {
        this.mixStreamId = mixStreamId;
        return this;
    }
    public String getMixStreamId() {
        return this.mixStreamId;
    }

}
