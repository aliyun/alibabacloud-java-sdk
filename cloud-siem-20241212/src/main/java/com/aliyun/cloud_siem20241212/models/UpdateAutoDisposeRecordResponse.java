// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateAutoDisposeRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAutoDisposeRecordResponseBody body;

    public static UpdateAutoDisposeRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAutoDisposeRecordResponse self = new UpdateAutoDisposeRecordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAutoDisposeRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAutoDisposeRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAutoDisposeRecordResponse setBody(UpdateAutoDisposeRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAutoDisposeRecordResponseBody getBody() {
        return this.body;
    }

}
