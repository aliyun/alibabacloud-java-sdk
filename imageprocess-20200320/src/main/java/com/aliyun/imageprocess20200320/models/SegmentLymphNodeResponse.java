// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentLymphNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SegmentLymphNodeResponseBody body;

    public static SegmentLymphNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentLymphNodeResponse self = new SegmentLymphNodeResponse();
        return TeaModel.build(map, self);
    }

    public SegmentLymphNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentLymphNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SegmentLymphNodeResponse setBody(SegmentLymphNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentLymphNodeResponseBody getBody() {
        return this.body;
    }

}
