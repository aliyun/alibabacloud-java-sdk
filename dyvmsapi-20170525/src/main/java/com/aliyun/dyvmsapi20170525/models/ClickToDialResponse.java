// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClickToDialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClickToDialResponseBody body;

    public static ClickToDialResponse build(java.util.Map<String, ?> map) throws Exception {
        ClickToDialResponse self = new ClickToDialResponse();
        return TeaModel.build(map, self);
    }

    public ClickToDialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClickToDialResponse setBody(ClickToDialResponseBody body) {
        this.body = body;
        return this;
    }
    public ClickToDialResponseBody getBody() {
        return this.body;
    }

}
