// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompareFaceVerifyResponseBody body;

    public static CompareFaceVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceVerifyResponse self = new CompareFaceVerifyResponse();
        return TeaModel.build(map, self);
    }

    public CompareFaceVerifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareFaceVerifyResponse setBody(CompareFaceVerifyResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareFaceVerifyResponseBody getBody() {
        return this.body;
    }

}
