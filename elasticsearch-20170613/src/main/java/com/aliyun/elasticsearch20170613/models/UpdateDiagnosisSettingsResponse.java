// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateDiagnosisSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDiagnosisSettingsResponseBody body;

    public static UpdateDiagnosisSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiagnosisSettingsResponse self = new UpdateDiagnosisSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDiagnosisSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDiagnosisSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDiagnosisSettingsResponse setBody(UpdateDiagnosisSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDiagnosisSettingsResponseBody getBody() {
        return this.body;
    }

}
