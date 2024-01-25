// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SubmitOperationCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitOperationCredentialsResponseBody body;

    public static SubmitOperationCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitOperationCredentialsResponse self = new SubmitOperationCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitOperationCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitOperationCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitOperationCredentialsResponse setBody(SubmitOperationCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitOperationCredentialsResponseBody getBody() {
        return this.body;
    }

}
