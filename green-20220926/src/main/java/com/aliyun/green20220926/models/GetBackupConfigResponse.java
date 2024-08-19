// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetBackupConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBackupConfigResponseBody body;

    public static GetBackupConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBackupConfigResponse self = new GetBackupConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetBackupConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBackupConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBackupConfigResponse setBody(GetBackupConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBackupConfigResponseBody getBody() {
        return this.body;
    }

}
