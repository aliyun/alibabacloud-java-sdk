// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class OfflineBatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OfflineBatchTaskResponseBody body;

    public static OfflineBatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineBatchTaskResponse self = new OfflineBatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public OfflineBatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineBatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OfflineBatchTaskResponse setBody(OfflineBatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineBatchTaskResponseBody getBody() {
        return this.body;
    }

}
