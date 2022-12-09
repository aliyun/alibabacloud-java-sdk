// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetAutoPickPicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAutoPickPicResponseBody body;

    public static GetAutoPickPicResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoPickPicResponse self = new GetAutoPickPicResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoPickPicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoPickPicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoPickPicResponse setBody(GetAutoPickPicResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoPickPicResponseBody getBody() {
        return this.body;
    }

}
