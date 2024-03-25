// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenAttachedChildInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeCenAttachedChildInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenAttachedChildInstancesResponse setBody(DescribeCenAttachedChildInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenAttachedChildInstancesResponseBody getBody() {
        return this.body;
    }

}
