// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateMixStreamResponseBody extends TeaModel {
    @NameInMap("MixStreamId")
    public String mixStreamId;

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
