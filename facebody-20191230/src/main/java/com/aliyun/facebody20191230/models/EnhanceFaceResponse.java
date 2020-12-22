// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class EnhanceFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnhanceFaceResponseBody body;

    public static EnhanceFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnhanceFaceResponse self = new EnhanceFaceResponse();
        return TeaModel.build(map, self);
    }

    public EnhanceFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnhanceFaceResponse setBody(EnhanceFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnhanceFaceResponseBody getBody() {
        return this.body;
    }

}
