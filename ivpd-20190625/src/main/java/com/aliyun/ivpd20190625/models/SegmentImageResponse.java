// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentImageResponseBody body;

    public static SegmentImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentImageResponse self = new SegmentImageResponse();
        return TeaModel.build(map, self);
    }

    public SegmentImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentImageResponse setBody(SegmentImageResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentImageResponseBody getBody() {
        return this.body;
    }

}
