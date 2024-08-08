// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class BatchEnrollAccountsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchEnrollAccountsResponseBody body;

    public static BatchEnrollAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchEnrollAccountsResponse self = new BatchEnrollAccountsResponse();
        return TeaModel.build(map, self);
    }

    public BatchEnrollAccountsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchEnrollAccountsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchEnrollAccountsResponse setBody(BatchEnrollAccountsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchEnrollAccountsResponseBody getBody() {
        return this.body;
    }

}
