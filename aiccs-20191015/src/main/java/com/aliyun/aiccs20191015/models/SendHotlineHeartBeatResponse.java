// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class SendHotlineHeartBeatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
