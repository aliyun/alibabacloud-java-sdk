// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class ExtendImageStyleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtendImageStyleResponseBody body;

    public static ExtendImageStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtendImageStyleResponse self = new ExtendImageStyleResponse();
        return TeaModel.build(map, self);
    }

    public ExtendImageStyleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtendImageStyleResponse setBody(ExtendImageStyleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtendImageStyleResponseBody getBody() {
        return this.body;
    }

}
