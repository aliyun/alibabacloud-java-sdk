// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCenAttachedChildInstancesResponseBody body;

    public static DescribeCenAttachedChildInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenAttachedChildInstancesResponse self = new DescribeCenAttachedChildInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenAttachedChildInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenAttachedChildInstancesResponse setBody(DescribeCenAttachedChildInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenAttachedChildInstancesResponseBody getBody() {
        return this.body;
    }

}
