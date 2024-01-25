// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceLabelResponseBody body;

    public static UpdateServiceLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceLabelResponse self = new UpdateServiceLabelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceLabelResponse setBody(UpdateServiceLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceLabelResponseBody getBody() {
        return this.body;
    }

}
