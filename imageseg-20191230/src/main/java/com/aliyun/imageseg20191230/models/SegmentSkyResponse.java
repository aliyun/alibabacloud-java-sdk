// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSkyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentSkyResponseBody body;

    public static SegmentSkyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentSkyResponse self = new SegmentSkyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentSkyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentSkyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentSkyResponse setBody(SegmentSkyResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentSkyResponseBody getBody() {
        return this.body;
    }

}
