// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetAckInfoOfMessageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAckInfoOfMessageResponseBody body;

    public static GetAckInfoOfMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAckInfoOfMessageResponse self = new GetAckInfoOfMessageResponse();
        return TeaModel.build(map, self);
    }

    public GetAckInfoOfMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAckInfoOfMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAckInfoOfMessageResponse setBody(GetAckInfoOfMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAckInfoOfMessageResponseBody getBody() {
        return this.body;
    }

}
