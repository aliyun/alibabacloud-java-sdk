// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ConvertToFEEditingProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ConvertToFEEditingProjectResponseBody body;

    public static ConvertToFEEditingProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertToFEEditingProjectResponse self = new ConvertToFEEditingProjectResponse();
        return TeaModel.build(map, self);
    }

    public ConvertToFEEditingProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConvertToFEEditingProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConvertToFEEditingProjectResponse setBody(ConvertToFEEditingProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ConvertToFEEditingProjectResponseBody getBody() {
        return this.body;
    }

}
