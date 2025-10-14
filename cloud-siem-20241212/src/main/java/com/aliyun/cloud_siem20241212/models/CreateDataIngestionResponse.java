// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDataIngestionResponseBody body;

    public static CreateDataIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataIngestionResponse self = new CreateDataIngestionResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataIngestionResponse setBody(CreateDataIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataIngestionResponseBody getBody() {
        return this.body;
    }

}
