// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentOARResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentOARResponseBody body;

    public static SegmentOARResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentOARResponse self = new SegmentOARResponse();
        return TeaModel.build(map, self);
    }

    public SegmentOARResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentOARResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentOARResponse setBody(SegmentOARResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentOARResponseBody getBody() {
        return this.body;
    }

}
