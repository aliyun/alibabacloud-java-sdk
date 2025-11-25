// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateNatFirewallSyncTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNatFirewallSyncTaskResponseBody body;

    public static CreateNatFirewallSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNatFirewallSyncTaskResponse self = new CreateNatFirewallSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateNatFirewallSyncTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNatFirewallSyncTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNatFirewallSyncTaskResponse setBody(CreateNatFirewallSyncTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNatFirewallSyncTaskResponseBody getBody() {
        return this.body;
    }

}
