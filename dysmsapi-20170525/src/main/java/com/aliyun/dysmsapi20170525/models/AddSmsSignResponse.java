// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddSmsSignResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddSmsSignResponseBody body;

    public static AddSmsSignResponse build(java.util.Map<String, ?> map) throws Exception {
        AddSmsSignResponse self = new AddSmsSignResponse();
        return TeaModel.build(map, self);
    }

    public AddSmsSignResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddSmsSignResponse setBody(AddSmsSignResponseBody body) {
        this.body = body;
        return this;
    }
    public AddSmsSignResponseBody getBody() {
        return this.body;
    }

}
