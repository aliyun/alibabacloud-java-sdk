// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class ProductHotspotDetectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProductHotspotDetectionResponseBody body;

    public static ProductHotspotDetectionResponse build(java.util.Map<String, ?> map) throws Exception {
        ProductHotspotDetectionResponse self = new ProductHotspotDetectionResponse();
        return TeaModel.build(map, self);
    }

    public ProductHotspotDetectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProductHotspotDetectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProductHotspotDetectionResponse setBody(ProductHotspotDetectionResponseBody body) {
        this.body = body;
        return this;
    }
    public ProductHotspotDetectionResponseBody getBody() {
        return this.body;
    }

}
