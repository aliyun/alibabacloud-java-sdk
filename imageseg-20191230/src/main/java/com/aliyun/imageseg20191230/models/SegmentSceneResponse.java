// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentSceneResponseBody body;

    public static SegmentSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentSceneResponse self = new SegmentSceneResponse();
        return TeaModel.build(map, self);
    }

    public SegmentSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentSceneResponse setBody(SegmentSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentSceneResponseBody getBody() {
        return this.body;
    }

}
