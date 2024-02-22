// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class OpenDeliveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenDeliveryResponseBody body;

    public static OpenDeliveryResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDeliveryResponse self = new OpenDeliveryResponse();
        return TeaModel.build(map, self);
    }

    public OpenDeliveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDeliveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenDeliveryResponse setBody(OpenDeliveryResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDeliveryResponseBody getBody() {
        return this.body;
    }

}
