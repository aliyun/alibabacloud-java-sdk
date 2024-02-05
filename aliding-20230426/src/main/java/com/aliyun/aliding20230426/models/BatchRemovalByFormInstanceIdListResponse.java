// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchRemovalByFormInstanceIdListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRemovalByFormInstanceIdListResponseBody body;

    public static BatchRemovalByFormInstanceIdListResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRemovalByFormInstanceIdListResponse self = new BatchRemovalByFormInstanceIdListResponse();
        return TeaModel.build(map, self);
    }

    public BatchRemovalByFormInstanceIdListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRemovalByFormInstanceIdListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRemovalByFormInstanceIdListResponse setBody(BatchRemovalByFormInstanceIdListResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRemovalByFormInstanceIdListResponseBody getBody() {
        return this.body;
    }

}
