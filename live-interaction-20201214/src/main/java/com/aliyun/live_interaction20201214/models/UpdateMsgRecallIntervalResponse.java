// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class UpdateMsgRecallIntervalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsgRecallIntervalResponseBody body;

    public static UpdateMsgRecallIntervalResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsgRecallIntervalResponse self = new UpdateMsgRecallIntervalResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsgRecallIntervalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsgRecallIntervalResponse setBody(UpdateMsgRecallIntervalResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsgRecallIntervalResponseBody getBody() {
        return this.body;
    }

}
