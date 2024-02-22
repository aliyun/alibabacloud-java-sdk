// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class CloseDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CloseDeliveryResponseBody body;

    public static CloseDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseDeliveryResponse self = new CloseDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public CloseDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloseDeliveryResponse setBody(CloseDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseDeliveryResponseBody getBody() {
        return this.body;
    }

}
