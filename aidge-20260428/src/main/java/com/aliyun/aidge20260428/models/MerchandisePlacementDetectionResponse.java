// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MerchandisePlacementDetectionResponseBody body;

    public static MerchandisePlacementDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionResponse self = new MerchandisePlacementDetectionResponse();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MerchandisePlacementDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MerchandisePlacementDetectionResponse setBody(MerchandisePlacementDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public MerchandisePlacementDetectionResponseBody getBody() {
        return this.body;
    }

}
