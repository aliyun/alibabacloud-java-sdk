// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ControlHtmlResourceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamId")
    public String streamId;

    public static ControlHtmlResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ControlHtmlResourceResponseBody self = new ControlHtmlResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ControlHtmlResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ControlHtmlResourceResponseBody setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

}
