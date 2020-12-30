// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class LaunchAppraiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LaunchAppraiseResponseBody body;

    public static LaunchAppraiseResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchAppraiseResponse self = new LaunchAppraiseResponse();
        return TeaModel.build(map, self);
    }

    public LaunchAppraiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchAppraiseResponse setBody(LaunchAppraiseResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchAppraiseResponseBody getBody() {
        return this.body;
    }

}
