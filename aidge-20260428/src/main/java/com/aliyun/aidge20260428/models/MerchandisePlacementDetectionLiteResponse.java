// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionLiteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MerchandisePlacementDetectionLiteResponseBody body;

    public static MerchandisePlacementDetectionLiteResponse build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionLiteResponse self = new MerchandisePlacementDetectionLiteResponse();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionLiteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MerchandisePlacementDetectionLiteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MerchandisePlacementDetectionLiteResponse setBody(MerchandisePlacementDetectionLiteResponseBody body) {
        this.body = body;
        return this;
    }
    public MerchandisePlacementDetectionLiteResponseBody getBody() {
        return this.body;
    }

}
