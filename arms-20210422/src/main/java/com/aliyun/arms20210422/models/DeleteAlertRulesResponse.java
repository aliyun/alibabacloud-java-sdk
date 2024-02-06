// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DeleteAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAlertRulesResponseBody body;

    public static DeleteAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertRulesResponse self = new DeleteAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAlertRulesResponse setBody(DeleteAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAlertRulesResponseBody getBody() {
        return this.body;
    }

}
