// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetUploadCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetUploadCredentialsResponseBody body;

    public static GetUploadCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUploadCredentialsResponse self = new GetUploadCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public GetUploadCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUploadCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUploadCredentialsResponse setBody(GetUploadCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUploadCredentialsResponseBody getBody() {
        return this.body;
    }

}
