// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetHttpResponseHeaderModificationRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpResponseHeaderModificationRuleResponseBody body;

    public static GetHttpResponseHeaderModificationRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpResponseHeaderModificationRuleResponse self = new GetHttpResponseHeaderModificationRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpResponseHeaderModificationRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpResponseHeaderModificationRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpResponseHeaderModificationRuleResponse setBody(GetHttpResponseHeaderModificationRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpResponseHeaderModificationRuleResponseBody getBody() {
        return this.body;
    }

}
