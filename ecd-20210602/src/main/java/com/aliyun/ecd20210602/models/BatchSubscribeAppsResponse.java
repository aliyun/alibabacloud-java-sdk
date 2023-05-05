// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchSubscribeAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchSubscribeAppsResponseBody body;

    public static BatchSubscribeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSubscribeAppsResponse self = new BatchSubscribeAppsResponse();
        return TeaModel.build(map, self);
    }

    public BatchSubscribeAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSubscribeAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSubscribeAppsResponse setBody(BatchSubscribeAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSubscribeAppsResponseBody getBody() {
        return this.body;
    }

}
