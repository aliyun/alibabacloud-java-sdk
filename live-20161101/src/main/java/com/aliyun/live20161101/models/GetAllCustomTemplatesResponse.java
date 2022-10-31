// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetAllCustomTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllCustomTemplatesResponseBody body;

    public static GetAllCustomTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllCustomTemplatesResponse self = new GetAllCustomTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public GetAllCustomTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllCustomTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAllCustomTemplatesResponse setBody(GetAllCustomTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllCustomTemplatesResponseBody getBody() {
        return this.body;
    }

}
