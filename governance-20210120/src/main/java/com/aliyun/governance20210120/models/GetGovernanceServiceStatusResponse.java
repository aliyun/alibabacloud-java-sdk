// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetGovernanceServiceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetGovernanceServiceStatusResponseBody body;

    public static GetGovernanceServiceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceServiceStatusResponse self = new GetGovernanceServiceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetGovernanceServiceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGovernanceServiceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGovernanceServiceStatusResponse setBody(GetGovernanceServiceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGovernanceServiceStatusResponseBody getBody() {
        return this.body;
    }

}
