// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpRequestHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpRequestHeaderModificationRuleResponseBody body;

    public static GetHttpRequestHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpRequestHeaderModificationRuleResponse self = new GetHttpRequestHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpRequestHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpRequestHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpRequestHeaderModificationRuleResponse setBody(GetHttpRequestHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpRequestHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
