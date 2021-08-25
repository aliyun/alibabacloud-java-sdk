// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateRemediationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateRemediationResponse setBody(CreateRemediationResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRemediationResponseBody getBody() {
        return this.body;
    }

}
