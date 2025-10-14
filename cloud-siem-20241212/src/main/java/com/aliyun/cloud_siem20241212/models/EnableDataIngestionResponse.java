// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class EnableDataIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDataIngestionResponseBody body;

    public static EnableDataIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDataIngestionResponse self = new EnableDataIngestionResponse();
        return TeaModel.build(map, self);
    }

    public EnableDataIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDataIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDataIngestionResponse setBody(EnableDataIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDataIngestionResponseBody getBody() {
        return this.body;
    }

}
