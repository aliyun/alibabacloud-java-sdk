// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SegmentClothResponseBody body;

    public static SegmentClothResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothResponse self = new SegmentClothResponse();
        return TeaModel.build(map, self);
    }

    public SegmentClothResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentClothResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentClothResponse setBody(SegmentClothResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentClothResponseBody getBody() {
        return this.body;
    }

}
