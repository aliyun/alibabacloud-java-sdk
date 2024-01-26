// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAlertRulesResponseBody body;

    public static GetAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRulesResponse self = new GetAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public GetAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlertRulesResponse setBody(GetAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertRulesResponseBody getBody() {
        return this.body;
    }

}
