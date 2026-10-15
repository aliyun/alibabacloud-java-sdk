// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePriceTagDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MerchandisePriceTagDetectionResponseBody body;

    public static MerchandisePriceTagDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePriceTagDetectionResponse self = new MerchandisePriceTagDetectionResponse();
        return TeaModel.build(map, self);
    }

    public MerchandisePriceTagDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MerchandisePriceTagDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MerchandisePriceTagDetectionResponse setBody(MerchandisePriceTagDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public MerchandisePriceTagDetectionResponseBody getBody() {
        return this.body;
    }

}
