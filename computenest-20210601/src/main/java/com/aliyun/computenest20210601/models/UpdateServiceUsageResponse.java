// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateServiceUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceUsageResponseBody body;

    public static UpdateServiceUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceUsageResponse self = new UpdateServiceUsageResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceUsageResponse setBody(UpdateServiceUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceUsageResponseBody getBody() {
        return this.body;
    }

}
