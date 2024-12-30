// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BatchCreateDataLakePartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchCreateDataLakePartitionsResponseBody body;

    public static BatchCreateDataLakePartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDataLakePartitionsResponse self = new BatchCreateDataLakePartitionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchCreateDataLakePartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchCreateDataLakePartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchCreateDataLakePartitionsResponse setBody(BatchCreateDataLakePartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchCreateDataLakePartitionsResponseBody getBody() {
        return this.body;
    }

}
