// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ClassifyFNFResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClassifyFNFResponseBody body;

    public static ClassifyFNFResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyFNFResponse self = new ClassifyFNFResponse();
        return TeaModel.build(map, self);
    }

    public ClassifyFNFResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClassifyFNFResponse setBody(ClassifyFNFResponseBody body) {
        this.body = body;
        return this;
    }
    public ClassifyFNFResponseBody getBody() {
        return this.body;
    }

}
