// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDSkyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentHDSkyResponseBody body;

    public static SegmentHDSkyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDSkyResponse self = new SegmentHDSkyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHDSkyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentHDSkyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentHDSkyResponse setBody(SegmentHDSkyResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentHDSkyResponseBody getBody() {
        return this.body;
    }

}
