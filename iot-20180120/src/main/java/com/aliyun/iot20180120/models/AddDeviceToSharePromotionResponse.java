// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class AddDeviceToSharePromotionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDeviceToSharePromotionResponseBody body;

    public static AddDeviceToSharePromotionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceToSharePromotionResponse self = new AddDeviceToSharePromotionResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceToSharePromotionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceToSharePromotionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDeviceToSharePromotionResponse setBody(AddDeviceToSharePromotionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceToSharePromotionResponseBody getBody() {
        return this.body;
    }

}
