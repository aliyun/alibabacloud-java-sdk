// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmGlobalAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmGlobalAlertResponseBody body;

    public static UpdateCloudGtmGlobalAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmGlobalAlertResponse self = new UpdateCloudGtmGlobalAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmGlobalAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmGlobalAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmGlobalAlertResponse setBody(UpdateCloudGtmGlobalAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmGlobalAlertResponseBody getBody() {
        return this.body;
    }

}
