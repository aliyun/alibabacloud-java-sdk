// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDataBatchIngestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataBatchIngestionResponseBody body;

    public static GetDataBatchIngestionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataBatchIngestionResponse self = new GetDataBatchIngestionResponse();
        return TeaModel.build(map, self);
    }

    public GetDataBatchIngestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataBatchIngestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataBatchIngestionResponse setBody(GetDataBatchIngestionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataBatchIngestionResponseBody getBody() {
        return this.body;
    }

}
