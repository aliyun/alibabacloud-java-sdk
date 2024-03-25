// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenChildInstanceRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenChildInstanceRouteEntriesResponseBody body;

    public static DescribeCenChildInstanceRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenChildInstanceRouteEntriesResponse self = new DescribeCenChildInstanceRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenChildInstanceRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenChildInstanceRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenChildInstanceRouteEntriesResponse setBody(DescribeCenChildInstanceRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenChildInstanceRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
