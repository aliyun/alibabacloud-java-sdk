// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentHairResponseBody body;

    public static SegmentHairResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairResponse self = new SegmentHairResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHairResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentHairResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentHairResponse setBody(SegmentHairResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentHairResponseBody getBody() {
        return this.body;
    }

}
