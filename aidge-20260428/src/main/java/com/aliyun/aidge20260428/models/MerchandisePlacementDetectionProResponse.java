// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class MerchandisePlacementDetectionProResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MerchandisePlacementDetectionProResponseBody body;

    public static MerchandisePlacementDetectionProResponse build(java.util.Map<String, ?> map) throws Exception {
        MerchandisePlacementDetectionProResponse self = new MerchandisePlacementDetectionProResponse();
        return TeaModel.build(map, self);
    }

    public MerchandisePlacementDetectionProResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MerchandisePlacementDetectionProResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MerchandisePlacementDetectionProResponse setBody(MerchandisePlacementDetectionProResponseBody body) {
        this.body = body;
        return this;
    }
    public MerchandisePlacementDetectionProResponseBody getBody() {
        return this.body;
    }

}
