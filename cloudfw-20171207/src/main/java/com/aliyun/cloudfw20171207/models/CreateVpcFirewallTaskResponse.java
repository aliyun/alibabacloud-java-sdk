// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcFirewallTaskResponseBody body;

    public static CreateVpcFirewallTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallTaskResponse self = new CreateVpcFirewallTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcFirewallTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcFirewallTaskResponse setBody(CreateVpcFirewallTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcFirewallTaskResponseBody getBody() {
        return this.body;
    }

}
