// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ExportPrometheusRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ExportPrometheusRulesResponseBody body;

    public static ExportPrometheusRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportPrometheusRulesResponse self = new ExportPrometheusRulesResponse();
        return TeaModel.build(map, self);
    }

    public ExportPrometheusRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportPrometheusRulesResponse setBody(ExportPrometheusRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportPrometheusRulesResponseBody getBody() {
        return this.body;
    }

}
