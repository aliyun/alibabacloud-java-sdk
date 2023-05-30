// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallV2RoutePolicyListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTrFirewallV2RoutePolicyListResponseBody body;

    public static DescribeTrFirewallV2RoutePolicyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallV2RoutePolicyListResponse self = new DescribeTrFirewallV2RoutePolicyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallV2RoutePolicyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTrFirewallV2RoutePolicyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTrFirewallV2RoutePolicyListResponse setBody(DescribeTrFirewallV2RoutePolicyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTrFirewallV2RoutePolicyListResponseBody getBody() {
        return this.body;
    }

}
