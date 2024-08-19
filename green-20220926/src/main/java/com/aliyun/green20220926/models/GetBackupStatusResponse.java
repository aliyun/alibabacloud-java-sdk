// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBackupStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBackupStatusResponseBody body;

    public static GetBackupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackupStatusResponse self = new GetBackupStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetBackupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackupStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBackupStatusResponse setBody(GetBackupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackupStatusResponseBody getBody() {
        return this.body;
    }

}
