// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenChildInstanceRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCenChildInstanceRouteEntriesResponse setBody(DescribeCenChildInstanceRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenChildInstanceRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
