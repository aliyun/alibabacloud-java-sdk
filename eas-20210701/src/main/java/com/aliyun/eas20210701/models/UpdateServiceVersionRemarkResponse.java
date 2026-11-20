// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceVersionRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceVersionRemarkResponseBody body;

    public static UpdateServiceVersionRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceVersionRemarkResponse self = new UpdateServiceVersionRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceVersionRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceVersionRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceVersionRemarkResponse setBody(UpdateServiceVersionRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceVersionRemarkResponseBody getBody() {
        return this.body;
    }

}
