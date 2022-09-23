// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class CreateSubsTrialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSubsTrialResponseBody body;

    public static CreateSubsTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubsTrialResponse self = new CreateSubsTrialResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubsTrialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubsTrialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubsTrialResponse setBody(CreateSubsTrialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubsTrialResponseBody getBody() {
        return this.body;
    }

}
