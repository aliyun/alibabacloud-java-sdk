// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class PublishAppConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PublishAppConfigResponseBody body;

    public static PublishAppConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishAppConfigResponse self = new PublishAppConfigResponse();
        return TeaModel.build(map, self);
    }

    public PublishAppConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishAppConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishAppConfigResponse setBody(PublishAppConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishAppConfigResponseBody getBody() {
        return this.body;
    }

}
