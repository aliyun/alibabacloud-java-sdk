// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamState")
    public String streamState;

    @NameInMap("Type")
    public String type;

    public static DescribeLiveStreamStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamStateResponseBody self = new DescribeLiveStreamStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamStateResponseBody setStreamState(String streamState) {
        this.streamState = streamState;
        return this;
    }
    public String getStreamState() {
        return this.streamState;
    }

    public DescribeLiveStreamStateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
