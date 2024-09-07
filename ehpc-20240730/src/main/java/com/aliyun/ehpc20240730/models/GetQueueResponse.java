// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetQueueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueueResponseBody body;

    public static GetQueueResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueueResponse self = new GetQueueResponse();
        return TeaModel.build(map, self);
    }

    public GetQueueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueueResponse setBody(GetQueueResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueueResponseBody getBody() {
        return this.body;
    }

}
