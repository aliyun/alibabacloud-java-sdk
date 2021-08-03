// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210803_112546244.models;

import com.aliyun.tea.*;

public class ArrayOutputResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<String> body;

    public static ArrayOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ArrayOutputResponse self = new ArrayOutputResponse();
        return TeaModel.build(map, self);
    }

    public ArrayOutputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ArrayOutputResponse setBody(java.util.List<String> body) {
        this.body = body;
        return this;
    }
    public java.util.List<String> getBody() {
        return this.body;
    }

}
