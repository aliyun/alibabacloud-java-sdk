// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateKibanaWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateKibanaWhiteIpsResponseBody body;

    public static UpdateKibanaWhiteIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateKibanaWhiteIpsResponse self = new UpdateKibanaWhiteIpsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateKibanaWhiteIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateKibanaWhiteIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateKibanaWhiteIpsResponse setBody(UpdateKibanaWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateKibanaWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
