// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class SendIdentityValidateResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendIdentityValidateResultResponseBody body;

    public static SendIdentityValidateResultResponse build(java.util.Map<String, ?> map) throws Exception {
        SendIdentityValidateResultResponse self = new SendIdentityValidateResultResponse();
        return TeaModel.build(map, self);
    }

    public SendIdentityValidateResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendIdentityValidateResultResponse setBody(SendIdentityValidateResultResponseBody body) {
        this.body = body;
        return this;
    }
    public SendIdentityValidateResultResponseBody getBody() {
        return this.body;
    }

}
