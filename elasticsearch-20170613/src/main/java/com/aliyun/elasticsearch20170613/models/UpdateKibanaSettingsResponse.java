// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaSettingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKibanaSettingsResponseBody body;

    public static UpdateKibanaSettingsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaSettingsResponse self = new UpdateKibanaSettingsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaSettingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKibanaSettingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKibanaSettingsResponse setBody(UpdateKibanaSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKibanaSettingsResponseBody getBody() {
        return this.body;
    }

}
