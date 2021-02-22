// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHeadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentHeadResponseBody body;

    public static SegmentHeadResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHeadResponse self = new SegmentHeadResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHeadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentHeadResponse setBody(SegmentHeadResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentHeadResponseBody getBody() {
        return this.body;
    }

}
