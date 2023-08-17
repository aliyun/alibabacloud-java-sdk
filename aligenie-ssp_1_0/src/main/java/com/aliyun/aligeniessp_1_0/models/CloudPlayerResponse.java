// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CloudPlayerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloudPlayerResponseBody body;

    public static CloudPlayerResponse build(java.util.Map<String, ?> map) throws Exception {
        CloudPlayerResponse self = new CloudPlayerResponse();
        return TeaModel.build(map, self);
    }

    public CloudPlayerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloudPlayerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloudPlayerResponse setBody(CloudPlayerResponseBody body) {
        this.body = body;
        return this;
    }
    public CloudPlayerResponseBody getBody() {
        return this.body;
    }

}
