// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByTtsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SingleCallByTtsResponseBody body;

    public static SingleCallByTtsResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByTtsResponse self = new SingleCallByTtsResponse();
        return TeaModel.build(map, self);
    }

    public SingleCallByTtsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleCallByTtsResponse setBody(SingleCallByTtsResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleCallByTtsResponseBody getBody() {
        return this.body;
    }

}
