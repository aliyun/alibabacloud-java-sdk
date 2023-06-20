// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class BatchUpdateStoreTextDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchUpdateStoreTextDataResponseBody body;

    public static BatchUpdateStoreTextDataResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateStoreTextDataResponse self = new BatchUpdateStoreTextDataResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateStoreTextDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateStoreTextDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateStoreTextDataResponse setBody(BatchUpdateStoreTextDataResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateStoreTextDataResponseBody getBody() {
        return this.body;
    }

}
