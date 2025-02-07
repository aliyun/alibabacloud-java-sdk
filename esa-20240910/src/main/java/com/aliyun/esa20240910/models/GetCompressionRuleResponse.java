// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCompressionRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCompressionRuleResponseBody body;

    public static GetCompressionRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCompressionRuleResponse self = new GetCompressionRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetCompressionRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCompressionRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCompressionRuleResponse setBody(GetCompressionRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCompressionRuleResponseBody getBody() {
        return this.body;
    }

}
