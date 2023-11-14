// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeepfakeFaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeepfakeFaceResponseBody body;

    public static DeepfakeFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeFaceResponse self = new DeepfakeFaceResponse();
        return TeaModel.build(map, self);
    }

    public DeepfakeFaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeepfakeFaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeepfakeFaceResponse setBody(DeepfakeFaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeepfakeFaceResponseBody getBody() {
        return this.body;
    }

}
