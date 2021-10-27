// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class RearrangeDbToInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RearrangeDbToInstanceResponseBody body;

    public static RearrangeDbToInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RearrangeDbToInstanceResponse self = new RearrangeDbToInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RearrangeDbToInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RearrangeDbToInstanceResponse setBody(RearrangeDbToInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RearrangeDbToInstanceResponseBody getBody() {
        return this.body;
    }

}
