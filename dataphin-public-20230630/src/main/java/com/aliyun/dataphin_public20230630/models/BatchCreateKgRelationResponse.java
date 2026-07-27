// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class BatchCreateKgRelationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateKgRelationResponseBody body;

    public static BatchCreateKgRelationResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateKgRelationResponse self = new BatchCreateKgRelationResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateKgRelationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateKgRelationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateKgRelationResponse setBody(BatchCreateKgRelationResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateKgRelationResponseBody getBody() {
        return this.body;
    }

}
