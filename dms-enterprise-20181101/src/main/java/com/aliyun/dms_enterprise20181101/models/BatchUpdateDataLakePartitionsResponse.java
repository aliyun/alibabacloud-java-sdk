// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BatchUpdateDataLakePartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateDataLakePartitionsResponseBody body;

    public static BatchUpdateDataLakePartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateDataLakePartitionsResponse self = new BatchUpdateDataLakePartitionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateDataLakePartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateDataLakePartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateDataLakePartitionsResponse setBody(BatchUpdateDataLakePartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateDataLakePartitionsResponseBody getBody() {
        return this.body;
    }

}
