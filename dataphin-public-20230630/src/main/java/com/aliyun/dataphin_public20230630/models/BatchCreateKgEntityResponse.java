// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchCreateKgEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateKgEntityResponseBody body;

    public static BatchCreateKgEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateKgEntityResponse self = new BatchCreateKgEntityResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateKgEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateKgEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateKgEntityResponse setBody(BatchCreateKgEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateKgEntityResponseBody getBody() {
        return this.body;
    }

}
