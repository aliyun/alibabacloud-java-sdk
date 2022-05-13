// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDirectorySsoStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDirectorySsoStatusResponseBody body;

    public static GetDirectorySsoStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDirectorySsoStatusResponse self = new GetDirectorySsoStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetDirectorySsoStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDirectorySsoStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDirectorySsoStatusResponse setBody(GetDirectorySsoStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDirectorySsoStatusResponseBody getBody() {
        return this.body;
    }

}
