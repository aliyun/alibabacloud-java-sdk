// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DisableDataIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDataIngestionResponseBody body;

    public static DisableDataIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDataIngestionResponse self = new DisableDataIngestionResponse();
        return TeaModel.build(map, self);
    }

    public DisableDataIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDataIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDataIngestionResponse setBody(DisableDataIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDataIngestionResponseBody getBody() {
        return this.body;
    }

}
