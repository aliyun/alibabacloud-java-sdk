// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class LaunchShortMessageAppraiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public LaunchShortMessageAppraiseResponseBody body;

    public static LaunchShortMessageAppraiseResponse build(java.util.Map<String, ?> map) throws Exception {
        LaunchShortMessageAppraiseResponse self = new LaunchShortMessageAppraiseResponse();
        return TeaModel.build(map, self);
    }

    public LaunchShortMessageAppraiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LaunchShortMessageAppraiseResponse setBody(LaunchShortMessageAppraiseResponseBody body) {
        this.body = body;
        return this;
    }
    public LaunchShortMessageAppraiseResponseBody getBody() {
        return this.body;
    }

}
