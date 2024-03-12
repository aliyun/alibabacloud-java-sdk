// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneRuleDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInterveneRuleDetailResponseBody body;

    public static GetInterveneRuleDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneRuleDetailResponse self = new GetInterveneRuleDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetInterveneRuleDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInterveneRuleDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInterveneRuleDetailResponse setBody(GetInterveneRuleDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInterveneRuleDetailResponseBody getBody() {
        return this.body;
    }

}
