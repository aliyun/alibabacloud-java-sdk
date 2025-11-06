// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetVhostErrorByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVhostErrorByTaskIdResponseBody body;

    public static GetVhostErrorByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVhostErrorByTaskIdResponse self = new GetVhostErrorByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public GetVhostErrorByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVhostErrorByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVhostErrorByTaskIdResponse setBody(GetVhostErrorByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVhostErrorByTaskIdResponseBody getBody() {
        return this.body;
    }

}
