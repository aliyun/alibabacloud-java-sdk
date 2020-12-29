// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSmsSignResponseBody body;

    public static DeleteSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsSignResponse self = new DeleteSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSmsSignResponse setBody(DeleteSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSmsSignResponseBody getBody() {
        return this.body;
    }

}
