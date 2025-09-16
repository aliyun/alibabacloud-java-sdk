// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpIncomingResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpIncomingResponseHeaderModificationRuleResponseBody body;

    public static GetHttpIncomingResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpIncomingResponseHeaderModificationRuleResponse self = new GetHttpIncomingResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpIncomingResponseHeaderModificationRuleResponse setBody(GetHttpIncomingResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpIncomingResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
