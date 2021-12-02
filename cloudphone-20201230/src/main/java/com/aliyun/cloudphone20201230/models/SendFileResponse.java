// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class SendFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SendFileResponseBody body;

    public static SendFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SendFileResponse self = new SendFileResponse();
        return TeaModel.build(map, self);
    }

    public SendFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendFileResponse setBody(SendFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SendFileResponseBody getBody() {
        return this.body;
    }

}
