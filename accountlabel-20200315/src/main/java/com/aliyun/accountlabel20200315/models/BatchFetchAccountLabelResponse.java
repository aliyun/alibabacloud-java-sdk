// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountlabel20200315.models;

import com.aliyun.tea.*;

public class BatchFetchAccountLabelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchFetchAccountLabelResponseBody body;

    public static BatchFetchAccountLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchFetchAccountLabelResponse self = new BatchFetchAccountLabelResponse();
        return TeaModel.build(map, self);
    }

    public BatchFetchAccountLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchFetchAccountLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchFetchAccountLabelResponse setBody(BatchFetchAccountLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchFetchAccountLabelResponseBody getBody() {
        return this.body;
    }

}
