// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaSettingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateKibanaSettingsResponse setBody(UpdateKibanaSettingsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKibanaSettingsResponseBody getBody() {
        return this.body;
    }

}
