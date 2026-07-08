// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class BatchUpdateNoticeStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateNoticeStatusResponseBody body;

    public static BatchUpdateNoticeStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateNoticeStatusResponse self = new BatchUpdateNoticeStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateNoticeStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateNoticeStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateNoticeStatusResponse setBody(BatchUpdateNoticeStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateNoticeStatusResponseBody getBody() {
        return this.body;
    }

}
