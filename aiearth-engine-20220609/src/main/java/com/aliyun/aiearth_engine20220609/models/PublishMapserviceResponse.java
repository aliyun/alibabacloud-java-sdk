// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class PublishMapserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishMapserviceResponseBody body;

    public static PublishMapserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishMapserviceResponse self = new PublishMapserviceResponse();
        return TeaModel.build(map, self);
    }

    public PublishMapserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishMapserviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishMapserviceResponse setBody(PublishMapserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishMapserviceResponseBody getBody() {
        return this.body;
    }

}
