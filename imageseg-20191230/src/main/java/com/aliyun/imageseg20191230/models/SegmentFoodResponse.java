// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFoodResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SegmentFoodResponseBody body;

    public static SegmentFoodResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFoodResponse self = new SegmentFoodResponse();
        return TeaModel.build(map, self);
    }

    public SegmentFoodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentFoodResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentFoodResponse setBody(SegmentFoodResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentFoodResponseBody getBody() {
        return this.body;
    }

}
