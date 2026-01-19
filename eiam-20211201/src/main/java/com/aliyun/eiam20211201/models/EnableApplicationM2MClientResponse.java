// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationM2MClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableApplicationM2MClientResponseBody body;

    public static EnableApplicationM2MClientResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationM2MClientResponse self = new EnableApplicationM2MClientResponse();
        return TeaModel.build(map, self);
    }

    public EnableApplicationM2MClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableApplicationM2MClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableApplicationM2MClientResponse setBody(EnableApplicationM2MClientResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableApplicationM2MClientResponseBody getBody() {
        return this.body;
    }

}
