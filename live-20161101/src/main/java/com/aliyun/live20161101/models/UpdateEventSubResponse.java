// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateEventSubResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEventSubResponseBody body;

    public static UpdateEventSubResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEventSubResponse self = new UpdateEventSubResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEventSubResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEventSubResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEventSubResponse setBody(UpdateEventSubResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEventSubResponseBody getBody() {
        return this.body;
    }

}
