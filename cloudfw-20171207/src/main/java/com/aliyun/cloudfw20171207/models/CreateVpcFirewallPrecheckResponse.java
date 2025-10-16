// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallPrecheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcFirewallPrecheckResponseBody body;

    public static CreateVpcFirewallPrecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallPrecheckResponse self = new CreateVpcFirewallPrecheckResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallPrecheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcFirewallPrecheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcFirewallPrecheckResponse setBody(CreateVpcFirewallPrecheckResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcFirewallPrecheckResponseBody getBody() {
        return this.body;
    }

}
