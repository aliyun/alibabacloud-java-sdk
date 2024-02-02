// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiagnosticMetricSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDiagnosticMetricSetResponseBody body;

    public static ModifyDiagnosticMetricSetResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiagnosticMetricSetResponse self = new ModifyDiagnosticMetricSetResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDiagnosticMetricSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDiagnosticMetricSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDiagnosticMetricSetResponse setBody(ModifyDiagnosticMetricSetResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDiagnosticMetricSetResponseBody getBody() {
        return this.body;
    }

}
