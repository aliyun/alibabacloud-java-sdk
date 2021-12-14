// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Query400SpecsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Query400SpecsResponseBody body;

    public static Query400SpecsResponse build(java.util.Map<String, ?> map) throws Exception {
        Query400SpecsResponse self = new Query400SpecsResponse();
        return TeaModel.build(map, self);
    }

    public Query400SpecsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Query400SpecsResponse setBody(Query400SpecsResponseBody body) {
        this.body = body;
        return this;
    }
    public Query400SpecsResponseBody getBody() {
        return this.body;
    }

}
