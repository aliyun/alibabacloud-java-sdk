// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amptest20201230.models;

import com.aliyun.tea.*;

public class HuichengetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HuichengetResponseBody body;

    public static HuichengetResponse build(java.util.Map<String, ?> map) throws Exception {
        HuichengetResponse self = new HuichengetResponse();
        return TeaModel.build(map, self);
    }

    public HuichengetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HuichengetResponse setBody(HuichengetResponseBody body) {
        this.body = body;
        return this;
    }
    public HuichengetResponseBody getBody() {
        return this.body;
    }

}
