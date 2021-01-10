// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMixStreamResponseBody extends TeaModel {
    @NameInMap("MixStreamId")
    public String mixStreamId;

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
