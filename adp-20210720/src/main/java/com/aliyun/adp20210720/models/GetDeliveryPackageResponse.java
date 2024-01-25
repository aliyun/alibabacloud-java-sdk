// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetDeliveryPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeliveryPackageResponseBody body;

    public static GetDeliveryPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeliveryPackageResponse self = new GetDeliveryPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetDeliveryPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeliveryPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeliveryPackageResponse setBody(GetDeliveryPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeliveryPackageResponseBody getBody() {
        return this.body;
    }

}
