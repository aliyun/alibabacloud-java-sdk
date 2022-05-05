// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ExploreTraceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExploreTraceResponseBody body;

    public static ExploreTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExploreTraceResponse self = new ExploreTraceResponse();
        return TeaModel.build(map, self);
    }

    public ExploreTraceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExploreTraceResponse setBody(ExploreTraceResponseBody body) {
        this.body = body;
        return this;
    }
    public ExploreTraceResponseBody getBody() {
        return this.body;
    }

}
