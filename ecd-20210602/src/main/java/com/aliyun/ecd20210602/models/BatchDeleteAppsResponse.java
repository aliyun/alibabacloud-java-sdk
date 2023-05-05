// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class BatchDeleteAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteAppsResponseBody body;

    public static BatchDeleteAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteAppsResponse self = new BatchDeleteAppsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteAppsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteAppsResponse setBody(BatchDeleteAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteAppsResponseBody getBody() {
        return this.body;
    }

}
