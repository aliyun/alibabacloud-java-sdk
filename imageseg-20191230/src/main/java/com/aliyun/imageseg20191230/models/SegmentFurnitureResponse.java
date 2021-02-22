// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFurnitureResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentFurnitureResponseBody body;

    public static SegmentFurnitureResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFurnitureResponse self = new SegmentFurnitureResponse();
        return TeaModel.build(map, self);
    }

    public SegmentFurnitureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentFurnitureResponse setBody(SegmentFurnitureResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentFurnitureResponseBody getBody() {
        return this.body;
    }

}
