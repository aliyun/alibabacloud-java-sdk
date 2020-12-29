// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ImportCustomAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ImportCustomAlertRulesResponse setBody(ImportCustomAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportCustomAlertRulesResponseBody getBody() {
        return this.body;
    }

}
