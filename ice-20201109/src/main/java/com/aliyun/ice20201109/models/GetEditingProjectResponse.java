// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEditingProjectResponseBody body;

    public static GetEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectResponse self = new GetEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEditingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEditingProjectResponse setBody(GetEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEditingProjectResponseBody getBody() {
        return this.body;
    }

}
