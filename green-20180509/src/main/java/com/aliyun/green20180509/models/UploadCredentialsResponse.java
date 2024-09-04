// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class UploadCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UploadCredentialsResponseBody body;

    public static UploadCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadCredentialsResponse self = new UploadCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public UploadCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadCredentialsResponse setBody(UploadCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadCredentialsResponseBody getBody() {
        return this.body;
    }

}
