// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendHotlineHeartBeatResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SendHotlineHeartBeatResponseBody body;

    public static SendHotlineHeartBeatResponse build(java.util.Map<String, ?> map) throws Exception {
        SendHotlineHeartBeatResponse self = new SendHotlineHeartBeatResponse();
        return TeaModel.build(map, self);
    }

    public SendHotlineHeartBeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendHotlineHeartBeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendHotlineHeartBeatResponse setBody(SendHotlineHeartBeatResponseBody body) {
        this.body = body;
        return this;
    }
    public SendHotlineHeartBeatResponseBody getBody() {
        return this.body;
    }

}
