// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateFirewallFeatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFirewallFeatureResponseBody body;

    public static UpdateFirewallFeatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFirewallFeatureResponse self = new UpdateFirewallFeatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFirewallFeatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFirewallFeatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFirewallFeatureResponse setBody(UpdateFirewallFeatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFirewallFeatureResponseBody getBody() {
        return this.body;
    }

}
