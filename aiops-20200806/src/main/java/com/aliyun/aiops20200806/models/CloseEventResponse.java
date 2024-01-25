// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CloseEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseEventResponseBody body;

    public static CloseEventResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseEventResponse self = new CloseEventResponse();
        return TeaModel.build(map, self);
    }

    public CloseEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseEventResponse setBody(CloseEventResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseEventResponseBody getBody() {
        return this.body;
    }

}
