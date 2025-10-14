// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataBatchIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataBatchIngestionResponseBody body;

    public static UpdateDataBatchIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataBatchIngestionResponse self = new UpdateDataBatchIngestionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataBatchIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataBatchIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataBatchIngestionResponse setBody(UpdateDataBatchIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataBatchIngestionResponseBody getBody() {
        return this.body;
    }

}
