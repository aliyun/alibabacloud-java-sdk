// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommodityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentCommodityResponseBody body;

    public static SegmentCommodityResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommodityResponse self = new SegmentCommodityResponse();
        return TeaModel.build(map, self);
    }

    public SegmentCommodityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentCommodityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentCommodityResponse setBody(SegmentCommodityResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentCommodityResponseBody getBody() {
        return this.body;
    }

}
