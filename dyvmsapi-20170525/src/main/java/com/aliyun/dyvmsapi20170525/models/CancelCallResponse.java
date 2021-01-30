// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CancelCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelCallResponseBody body;

    public static CancelCallResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelCallResponse self = new CancelCallResponse();
        return TeaModel.build(map, self);
    }

    public CancelCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelCallResponse setBody(CancelCallResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelCallResponseBody getBody() {
        return this.body;
    }

}
