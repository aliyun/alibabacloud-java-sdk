// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentLogoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentLogoResponseBody body;

    public static SegmentLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentLogoResponse self = new SegmentLogoResponse();
        return TeaModel.build(map, self);
    }

    public SegmentLogoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentLogoResponse setBody(SegmentLogoResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentLogoResponseBody getBody() {
        return this.body;
    }

}
