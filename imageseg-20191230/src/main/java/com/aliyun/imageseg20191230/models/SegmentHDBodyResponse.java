// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDBodyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentHDBodyResponseBody body;

    public static SegmentHDBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDBodyResponse self = new SegmentHDBodyResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHDBodyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentHDBodyResponse setBody(SegmentHDBodyResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentHDBodyResponseBody getBody() {
        return this.body;
    }

}
