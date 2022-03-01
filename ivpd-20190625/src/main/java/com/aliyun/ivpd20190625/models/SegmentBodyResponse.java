// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class SegmentBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentBodyResponseBody body;

    public static SegmentBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentBodyResponse self = new SegmentBodyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentBodyResponse setBody(SegmentBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentBodyResponseBody getBody() {
        return this.body;
    }

}
