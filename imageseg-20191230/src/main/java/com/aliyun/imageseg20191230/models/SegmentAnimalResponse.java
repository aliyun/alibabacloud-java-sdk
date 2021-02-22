// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentAnimalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SegmentAnimalResponseBody body;

    public static SegmentAnimalResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentAnimalResponse self = new SegmentAnimalResponse();
        return TeaModel.build(map, self);
    }

    public SegmentAnimalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SegmentAnimalResponse setBody(SegmentAnimalResponseBody body) {
        this.body = body;
        return this;
    }
    public SegmentAnimalResponseBody getBody() {
        return this.body;
    }

}
