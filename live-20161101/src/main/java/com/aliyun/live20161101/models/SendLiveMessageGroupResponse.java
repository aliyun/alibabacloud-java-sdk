// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLiveMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendLiveMessageGroupResponseBody body;

    public static SendLiveMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SendLiveMessageGroupResponse self = new SendLiveMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public SendLiveMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendLiveMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendLiveMessageGroupResponse setBody(SendLiveMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public SendLiveMessageGroupResponseBody getBody() {
        return this.body;
    }

}
