// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetAlertRulesResponse setBody(GetAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlertRulesResponseBody getBody() {
        return this.body;
    }

}
