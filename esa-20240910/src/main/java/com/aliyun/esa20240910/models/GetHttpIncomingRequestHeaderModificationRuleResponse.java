// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpIncomingRequestHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpIncomingRequestHeaderModificationRuleResponseBody body;

    public static GetHttpIncomingRequestHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpIncomingRequestHeaderModificationRuleResponse self = new GetHttpIncomingRequestHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpIncomingRequestHeaderModificationRuleResponse setBody(GetHttpIncomingRequestHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpIncomingRequestHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
