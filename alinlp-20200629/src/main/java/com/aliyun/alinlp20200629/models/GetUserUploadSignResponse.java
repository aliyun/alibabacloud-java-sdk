// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetUserUploadSignResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserUploadSignResponseBody body;

    public static GetUserUploadSignResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserUploadSignResponse self = new GetUserUploadSignResponse();
        return TeaModel.build(map, self);
    }

    public GetUserUploadSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserUploadSignResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserUploadSignResponse setBody(GetUserUploadSignResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserUploadSignResponseBody getBody() {
        return this.body;
    }

}
