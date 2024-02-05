// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchSaveFormDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSaveFormDataResponseBody body;

    public static BatchSaveFormDataResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveFormDataResponse self = new BatchSaveFormDataResponse();
        return TeaModel.build(map, self);
    }

    public BatchSaveFormDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSaveFormDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSaveFormDataResponse setBody(BatchSaveFormDataResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSaveFormDataResponseBody getBody() {
        return this.body;
    }

}
