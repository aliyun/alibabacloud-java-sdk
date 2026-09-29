// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class DecommissionGovernanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DecommissionGovernanceResponseBody body;

    public static DecommissionGovernanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DecommissionGovernanceResponse self = new DecommissionGovernanceResponse();
        return TeaModel.build(map, self);
    }

    public DecommissionGovernanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DecommissionGovernanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DecommissionGovernanceResponse setBody(DecommissionGovernanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DecommissionGovernanceResponseBody getBody() {
        return this.body;
    }

}
