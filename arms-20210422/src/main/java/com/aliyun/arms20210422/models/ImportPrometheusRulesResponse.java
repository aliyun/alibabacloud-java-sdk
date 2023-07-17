// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ImportPrometheusRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportPrometheusRulesResponseBody body;

    public static ImportPrometheusRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportPrometheusRulesResponse self = new ImportPrometheusRulesResponse();
        return TeaModel.build(map, self);
    }

    public ImportPrometheusRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportPrometheusRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportPrometheusRulesResponse setBody(ImportPrometheusRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportPrometheusRulesResponseBody getBody() {
        return this.body;
    }

}
