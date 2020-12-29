// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRouteMapsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCenRouteMapsResponseBody body;

    public static DescribeCenRouteMapsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRouteMapsResponse self = new DescribeCenRouteMapsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenRouteMapsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenRouteMapsResponse setBody(DescribeCenRouteMapsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenRouteMapsResponseBody getBody() {
        return this.body;
    }

}
