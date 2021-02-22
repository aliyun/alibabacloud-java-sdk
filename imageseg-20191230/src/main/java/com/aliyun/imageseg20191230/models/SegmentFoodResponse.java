// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFoodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SegmentFoodResponse setBody(SegmentFoodResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentFoodResponseBody getBody() {
        return this.body;
    }

}
