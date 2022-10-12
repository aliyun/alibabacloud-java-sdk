// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentFaceResponseBody body;

    public static SegmentFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentFaceResponse self = new SegmentFaceResponse();
        return TeaModel.build(map, self);
    }

    public SegmentFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentFaceResponse setBody(SegmentFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentFaceResponseBody getBody() {
        return this.body;
    }

}
