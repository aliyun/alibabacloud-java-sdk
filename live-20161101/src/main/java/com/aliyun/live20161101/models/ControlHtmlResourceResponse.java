// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ControlHtmlResourceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StreamId")
    @Validation(required = true)
    public String streamId;

    public static ControlHtmlResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ControlHtmlResourceResponse self = new ControlHtmlResourceResponse();
        return TeaModel.build(map, self);
    }

    public ControlHtmlResourceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ControlHtmlResourceResponse setStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }
    public String getStreamId() {
        return this.streamId;
    }

}
