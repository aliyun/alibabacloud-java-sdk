// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmInstanceConfigAlertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCloudGtmInstanceConfigAlertResponseBody body;

    public static UpdateCloudGtmInstanceConfigAlertResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmInstanceConfigAlertResponse self = new UpdateCloudGtmInstanceConfigAlertResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmInstanceConfigAlertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCloudGtmInstanceConfigAlertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCloudGtmInstanceConfigAlertResponse setBody(UpdateCloudGtmInstanceConfigAlertResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCloudGtmInstanceConfigAlertResponseBody getBody() {
        return this.body;
    }

}
