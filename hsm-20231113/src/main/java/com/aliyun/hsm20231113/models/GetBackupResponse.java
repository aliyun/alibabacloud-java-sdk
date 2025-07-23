// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class GetBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBackupResponseBody body;

    public static GetBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackupResponse self = new GetBackupResponse();
        return TeaModel.build(map, self);
    }

    public GetBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBackupResponse setBody(GetBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackupResponseBody getBody() {
        return this.body;
    }

}
