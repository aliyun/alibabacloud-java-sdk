// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.address_purification20191118.models;

import com.aliyun.tea.*;

public class ExtractNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExtractNameResponseBody body;

    public static ExtractNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ExtractNameResponse self = new ExtractNameResponse();
        return TeaModel.build(map, self);
    }

    public ExtractNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExtractNameResponse setBody(ExtractNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ExtractNameResponseBody getBody() {
        return this.body;
    }

}
