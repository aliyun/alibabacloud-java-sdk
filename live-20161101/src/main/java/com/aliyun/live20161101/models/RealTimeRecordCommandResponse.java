// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RealTimeRecordCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RealTimeRecordCommandResponseBody body;

    public static RealTimeRecordCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RealTimeRecordCommandResponse self = new RealTimeRecordCommandResponse();
        return TeaModel.build(map, self);
    }

    public RealTimeRecordCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RealTimeRecordCommandResponse setBody(RealTimeRecordCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RealTimeRecordCommandResponseBody getBody() {
        return this.body;
    }

}
