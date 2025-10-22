// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BatchRecallPushResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRecallPushResponseBody body;

    public static BatchRecallPushResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRecallPushResponse self = new BatchRecallPushResponse();
        return TeaModel.build(map, self);
    }

    public BatchRecallPushResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRecallPushResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRecallPushResponse setBody(BatchRecallPushResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRecallPushResponseBody getBody() {
        return this.body;
    }

}
