// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateServiceQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceQAResponseBody body;

    public static UpdateServiceQAResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceQAResponse self = new UpdateServiceQAResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceQAResponse setBody(UpdateServiceQAResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceQAResponseBody getBody() {
        return this.body;
    }

}
