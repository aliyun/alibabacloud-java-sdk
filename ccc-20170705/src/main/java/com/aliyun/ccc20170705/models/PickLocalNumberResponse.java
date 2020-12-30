// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class PickLocalNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PickLocalNumberResponseBody body;

    public static PickLocalNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        PickLocalNumberResponse self = new PickLocalNumberResponse();
        return TeaModel.build(map, self);
    }

    public PickLocalNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PickLocalNumberResponse setBody(PickLocalNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public PickLocalNumberResponseBody getBody() {
        return this.body;
    }

}
