// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class EvaluatePreConfigRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EvaluatePreConfigRulesResponseBody body;

    public static EvaluatePreConfigRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        EvaluatePreConfigRulesResponse self = new EvaluatePreConfigRulesResponse();
        return TeaModel.build(map, self);
    }

    public EvaluatePreConfigRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EvaluatePreConfigRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EvaluatePreConfigRulesResponse setBody(EvaluatePreConfigRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public EvaluatePreConfigRulesResponseBody getBody() {
        return this.body;
    }

}
