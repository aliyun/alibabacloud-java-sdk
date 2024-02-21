// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateWhiteIpsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWhiteIpsResponseBody body;

    public static UpdateWhiteIpsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteIpsResponse self = new UpdateWhiteIpsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteIpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWhiteIpsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWhiteIpsResponse setBody(UpdateWhiteIpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWhiteIpsResponseBody getBody() {
        return this.body;
    }

}
