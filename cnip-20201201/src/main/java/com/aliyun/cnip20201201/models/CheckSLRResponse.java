// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class CheckSLRResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckSLRResponseBody body;

    public static CheckSLRResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckSLRResponse self = new CheckSLRResponse();
        return TeaModel.build(map, self);
    }

    public CheckSLRResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckSLRResponse setBody(CheckSLRResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckSLRResponseBody getBody() {
        return this.body;
    }

}
