// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2RouteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTrFirewallsV2RouteListResponseBody body;

    public static DescribeTrFirewallsV2RouteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2RouteListResponse self = new DescribeTrFirewallsV2RouteListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2RouteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrFirewallsV2RouteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrFirewallsV2RouteListResponse setBody(DescribeTrFirewallsV2RouteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrFirewallsV2RouteListResponseBody getBody() {
        return this.body;
    }

}
