// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchGetFormDataByIdListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetFormDataByIdListResponseBody body;

    public static BatchGetFormDataByIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFormDataByIdListResponse self = new BatchGetFormDataByIdListResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetFormDataByIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetFormDataByIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetFormDataByIdListResponse setBody(BatchGetFormDataByIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetFormDataByIdListResponseBody getBody() {
        return this.body;
    }

}
