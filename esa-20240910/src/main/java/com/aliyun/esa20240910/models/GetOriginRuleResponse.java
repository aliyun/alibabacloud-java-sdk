// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginRuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOriginRuleResponseBody body;

    public static GetOriginRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginRuleResponse self = new GetOriginRuleResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginRuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOriginRuleResponse setBody(GetOriginRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginRuleResponseBody getBody() {
        return this.body;
    }

}
