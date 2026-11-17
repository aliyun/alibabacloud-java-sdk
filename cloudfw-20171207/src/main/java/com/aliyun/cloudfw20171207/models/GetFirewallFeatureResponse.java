// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class GetFirewallFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFirewallFeatureResponseBody body;

    public static GetFirewallFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFirewallFeatureResponse self = new GetFirewallFeatureResponse();
        return TeaModel.build(map, self);
    }

    public GetFirewallFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFirewallFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFirewallFeatureResponse setBody(GetFirewallFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFirewallFeatureResponseBody getBody() {
        return this.body;
    }

}
