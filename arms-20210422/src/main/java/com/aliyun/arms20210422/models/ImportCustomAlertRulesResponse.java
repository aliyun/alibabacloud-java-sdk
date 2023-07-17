// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ImportCustomAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportCustomAlertRulesResponseBody body;

    public static ImportCustomAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportCustomAlertRulesResponse self = new ImportCustomAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public ImportCustomAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportCustomAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportCustomAlertRulesResponse setBody(ImportCustomAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCustomAlertRulesResponseBody getBody() {
        return this.body;
    }

}
