// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataStorageDeliveryResponseBody body;

    public static UpdateDataStorageDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageDeliveryResponse self = new UpdateDataStorageDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataStorageDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataStorageDeliveryResponse setBody(UpdateDataStorageDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataStorageDeliveryResponseBody getBody() {
        return this.body;
    }

}
