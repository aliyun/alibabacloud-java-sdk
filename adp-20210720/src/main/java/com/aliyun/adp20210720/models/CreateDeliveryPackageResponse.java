// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class CreateDeliveryPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeliveryPackageResponseBody body;

    public static CreateDeliveryPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPackageResponse self = new CreateDeliveryPackageResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeliveryPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeliveryPackageResponse setBody(CreateDeliveryPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeliveryPackageResponseBody getBody() {
        return this.body;
    }

}
