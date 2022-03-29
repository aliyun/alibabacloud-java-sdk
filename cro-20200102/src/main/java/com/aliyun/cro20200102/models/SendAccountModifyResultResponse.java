// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class SendAccountModifyResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendAccountModifyResultResponseBody body;

    public static SendAccountModifyResultResponse build(java.util.Map<String, ?> map) throws Exception {
        SendAccountModifyResultResponse self = new SendAccountModifyResultResponse();
        return TeaModel.build(map, self);
    }

    public SendAccountModifyResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendAccountModifyResultResponse setBody(SendAccountModifyResultResponseBody body) {
        this.body = body;
        return this;
    }
    public SendAccountModifyResultResponseBody getBody() {
        return this.body;
    }

}
