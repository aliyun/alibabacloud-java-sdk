// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeCommoditiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCommoditiesResponseBody body;

    public static DescribeCommoditiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommoditiesResponse self = new DescribeCommoditiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCommoditiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCommoditiesResponse setBody(DescribeCommoditiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCommoditiesResponseBody getBody() {
        return this.body;
    }

}
