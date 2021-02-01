// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class ClassifyingRubbishResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClassifyingRubbishResponseBody body;

    public static ClassifyingRubbishResponse build(java.util.Map<String, ?> map) throws Exception {
        ClassifyingRubbishResponse self = new ClassifyingRubbishResponse();
        return TeaModel.build(map, self);
    }

    public ClassifyingRubbishResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClassifyingRubbishResponse setBody(ClassifyingRubbishResponseBody body) {
        this.body = body;
        return this;
    }
    public ClassifyingRubbishResponseBody getBody() {
        return this.body;
    }

}
