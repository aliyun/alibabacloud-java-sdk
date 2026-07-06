// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAlertResponseBody body;

    public static UpdateAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertResponse self = new UpdateAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAlertResponse setBody(UpdateAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAlertResponseBody getBody() {
        return this.body;
    }

}
