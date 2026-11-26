// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateMyAgenticNotificationChannelConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMyAgenticNotificationChannelConfigResponseBody body;

    public static UpdateMyAgenticNotificationChannelConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMyAgenticNotificationChannelConfigResponse self = new UpdateMyAgenticNotificationChannelConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMyAgenticNotificationChannelConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMyAgenticNotificationChannelConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMyAgenticNotificationChannelConfigResponse setBody(UpdateMyAgenticNotificationChannelConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMyAgenticNotificationChannelConfigResponseBody getBody() {
        return this.body;
    }

}
