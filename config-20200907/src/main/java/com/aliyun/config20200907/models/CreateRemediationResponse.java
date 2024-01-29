// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateRemediationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRemediationResponseBody body;

    public static CreateRemediationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRemediationResponse self = new CreateRemediationResponse();
        return TeaModel.build(map, self);
    }

    public CreateRemediationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRemediationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRemediationResponse setBody(CreateRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRemediationResponseBody getBody() {
        return this.body;
    }

}
