// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetTaskContextResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskContextResponseBody body;

    public static GetTaskContextResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskContextResponse self = new GetTaskContextResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskContextResponse setBody(GetTaskContextResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskContextResponseBody getBody() {
        return this.body;
    }

}
