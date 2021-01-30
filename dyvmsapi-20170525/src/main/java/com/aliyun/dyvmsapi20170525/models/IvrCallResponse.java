// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class IvrCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IvrCallResponseBody body;

    public static IvrCallResponse build(java.util.Map<String, ?> map) throws Exception {
        IvrCallResponse self = new IvrCallResponse();
        return TeaModel.build(map, self);
    }

    public IvrCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IvrCallResponse setBody(IvrCallResponseBody body) {
        this.body = body;
        return this;
    }
    public IvrCallResponseBody getBody() {
        return this.body;
    }

}
