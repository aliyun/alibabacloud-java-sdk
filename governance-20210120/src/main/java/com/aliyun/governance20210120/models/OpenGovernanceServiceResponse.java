// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class OpenGovernanceServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenGovernanceServiceResponseBody body;

    public static OpenGovernanceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenGovernanceServiceResponse self = new OpenGovernanceServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenGovernanceServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenGovernanceServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenGovernanceServiceResponse setBody(OpenGovernanceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenGovernanceServiceResponseBody getBody() {
        return this.body;
    }

}
