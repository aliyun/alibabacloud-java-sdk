// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterLayoutsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCasterLayoutsResponseBody body;

    public static DescribeCasterLayoutsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterLayoutsResponse self = new DescribeCasterLayoutsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterLayoutsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCasterLayoutsResponse setBody(DescribeCasterLayoutsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCasterLayoutsResponseBody getBody() {
        return this.body;
    }

}
