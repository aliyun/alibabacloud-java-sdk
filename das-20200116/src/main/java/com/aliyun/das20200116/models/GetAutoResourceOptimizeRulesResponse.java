// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAutoResourceOptimizeRulesResponseBody body;

    public static GetAutoResourceOptimizeRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAutoResourceOptimizeRulesResponse self = new GetAutoResourceOptimizeRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetAutoResourceOptimizeRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAutoResourceOptimizeRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAutoResourceOptimizeRulesResponse setBody(GetAutoResourceOptimizeRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAutoResourceOptimizeRulesResponseBody getBody() {
        return this.body;
    }

}
