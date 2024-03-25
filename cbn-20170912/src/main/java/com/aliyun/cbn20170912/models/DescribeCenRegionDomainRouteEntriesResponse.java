// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCenRegionDomainRouteEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCenRegionDomainRouteEntriesResponseBody body;

    public static DescribeCenRegionDomainRouteEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCenRegionDomainRouteEntriesResponse self = new DescribeCenRegionDomainRouteEntriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCenRegionDomainRouteEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCenRegionDomainRouteEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCenRegionDomainRouteEntriesResponse setBody(DescribeCenRegionDomainRouteEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCenRegionDomainRouteEntriesResponseBody getBody() {
        return this.body;
    }

}
