// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompareFaceResponseBody body;

    public static CompareFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceResponse self = new CompareFaceResponse();
        return TeaModel.build(map, self);
    }

    public CompareFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompareFaceResponse setBody(CompareFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CompareFaceResponseBody getBody() {
        return this.body;
    }

}
