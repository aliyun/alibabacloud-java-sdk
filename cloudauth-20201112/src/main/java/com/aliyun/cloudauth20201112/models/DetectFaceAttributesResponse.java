// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetectFaceAttributesResponseBody body;

    public static DetectFaceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesResponse self = new DetectFaceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectFaceAttributesResponse setBody(DetectFaceAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectFaceAttributesResponseBody getBody() {
        return this.body;
    }

}
