// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommonImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SegmentCommonImageResponseBody body;

    public static SegmentCommonImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommonImageResponse self = new SegmentCommonImageResponse();
        return TeaModel.build(map, self);
    }

    public SegmentCommonImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentCommonImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentCommonImageResponse setBody(SegmentCommonImageResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentCommonImageResponseBody getBody() {
        return this.body;
    }

}
