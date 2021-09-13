// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class TakeBreakResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TakeBreakResponseBody body;

    public static TakeBreakResponse build(java.util.Map<String, ?> map) throws Exception {
        TakeBreakResponse self = new TakeBreakResponse();
        return TeaModel.build(map, self);
    }

    public TakeBreakResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TakeBreakResponse setBody(TakeBreakResponseBody body) {
        this.body = body;
        return this;
    }
    public TakeBreakResponseBody getBody() {
        return this.body;
    }

}
