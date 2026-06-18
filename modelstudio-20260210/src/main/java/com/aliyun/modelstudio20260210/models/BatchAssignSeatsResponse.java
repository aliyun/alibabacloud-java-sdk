// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class BatchAssignSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchAssignSeatsResponseBody body;

    public static BatchAssignSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchAssignSeatsResponse self = new BatchAssignSeatsResponse();
        return TeaModel.build(map, self);
    }

    public BatchAssignSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchAssignSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchAssignSeatsResponse setBody(BatchAssignSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchAssignSeatsResponseBody getBody() {
        return this.body;
    }

}
