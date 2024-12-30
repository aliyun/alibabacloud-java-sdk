// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BatchDeleteDataLakePartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteDataLakePartitionsResponseBody body;

    public static BatchDeleteDataLakePartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDataLakePartitionsResponse self = new BatchDeleteDataLakePartitionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDataLakePartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteDataLakePartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteDataLakePartitionsResponse setBody(BatchDeleteDataLakePartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteDataLakePartitionsResponseBody getBody() {
        return this.body;
    }

}
