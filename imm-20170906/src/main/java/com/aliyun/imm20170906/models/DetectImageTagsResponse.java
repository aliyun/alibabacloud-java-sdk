// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectImageTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectImageTagsResponseBody body;

    public static DetectImageTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectImageTagsResponse self = new DetectImageTagsResponse();
        return TeaModel.build(map, self);
    }

    public DetectImageTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectImageTagsResponse setBody(DetectImageTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectImageTagsResponseBody getBody() {
        return this.body;
    }

}
