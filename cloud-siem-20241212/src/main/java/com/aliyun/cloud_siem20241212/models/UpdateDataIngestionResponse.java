// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataIngestionResponseBody body;

    public static UpdateDataIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataIngestionResponse self = new UpdateDataIngestionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataIngestionResponse setBody(UpdateDataIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataIngestionResponseBody getBody() {
        return this.body;
    }

}
