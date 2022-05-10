// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UpdateBimFragmentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateBimFragmentResponseBody body;

    public static UpdateBimFragmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBimFragmentResponse self = new UpdateBimFragmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBimFragmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBimFragmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBimFragmentResponse setBody(UpdateBimFragmentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBimFragmentResponseBody getBody() {
        return this.body;
    }

}
