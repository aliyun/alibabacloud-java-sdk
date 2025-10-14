// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteDataIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataIngestionResponseBody body;

    public static DeleteDataIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataIngestionResponse self = new DeleteDataIngestionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataIngestionResponse setBody(DeleteDataIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataIngestionResponseBody getBody() {
        return this.body;
    }

}
