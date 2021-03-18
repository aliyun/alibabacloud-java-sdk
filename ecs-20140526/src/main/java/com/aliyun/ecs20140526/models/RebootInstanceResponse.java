// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RebootInstanceResponseBody body;

    public static RebootInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootInstanceResponse self = new RebootInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RebootInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RebootInstanceResponse setBody(RebootInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RebootInstanceResponseBody getBody() {
        return this.body;
    }

}
