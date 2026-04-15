// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class VirtualDeliveryToMsceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public VirtualDeliveryToMsceneResponseBody body;

    public static VirtualDeliveryToMsceneResponse build(java.util.Map<String, ?> map) throws Exception {
        VirtualDeliveryToMsceneResponse self = new VirtualDeliveryToMsceneResponse();
        return TeaModel.build(map, self);
    }

    public VirtualDeliveryToMsceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public VirtualDeliveryToMsceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public VirtualDeliveryToMsceneResponse setBody(VirtualDeliveryToMsceneResponseBody body) {
        this.body = body;
        return this;
    }
    public VirtualDeliveryToMsceneResponseBody getBody() {
        return this.body;
    }

}
