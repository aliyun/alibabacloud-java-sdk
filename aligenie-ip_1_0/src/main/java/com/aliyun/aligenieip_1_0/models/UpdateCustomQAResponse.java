// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class UpdateCustomQAResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustomQAResponseBody body;

    public static UpdateCustomQAResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomQAResponse self = new UpdateCustomQAResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomQAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomQAResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomQAResponse setBody(UpdateCustomQAResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomQAResponseBody getBody() {
        return this.body;
    }

}
