// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class BatchCreateModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateModelResponseBody body;

    public static BatchCreateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateModelResponse self = new BatchCreateModelResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateModelResponse setBody(BatchCreateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateModelResponseBody getBody() {
        return this.body;
    }

}
