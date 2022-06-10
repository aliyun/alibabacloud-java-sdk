// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyOrderDeliveryAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOrderDeliveryAddressResponseBody body;

    public static ModifyOrderDeliveryAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrderDeliveryAddressResponse self = new ModifyOrderDeliveryAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOrderDeliveryAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOrderDeliveryAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOrderDeliveryAddressResponse setBody(ModifyOrderDeliveryAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOrderDeliveryAddressResponseBody getBody() {
        return this.body;
    }

}
