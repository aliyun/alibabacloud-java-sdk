// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDCommonImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentHDCommonImageResponseBody body;

    public static SegmentHDCommonImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDCommonImageResponse self = new SegmentHDCommonImageResponse();
        return TeaModel.build(map, self);
    }

    public SegmentHDCommonImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentHDCommonImageResponse setBody(SegmentHDCommonImageResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentHDCommonImageResponseBody getBody() {
        return this.body;
    }

}
