// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeRuleListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetQueryOptimizeRuleListResponseBody body;

    public static GetQueryOptimizeRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeRuleListResponse self = new GetQueryOptimizeRuleListResponse();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQueryOptimizeRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetQueryOptimizeRuleListResponse setBody(GetQueryOptimizeRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQueryOptimizeRuleListResponseBody getBody() {
        return this.body;
    }

}
