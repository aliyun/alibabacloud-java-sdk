// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ImportInterveneFileResponseBody body;

    public static ImportInterveneFileResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileResponse self = new ImportInterveneFileResponse();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportInterveneFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportInterveneFileResponse setBody(ImportInterveneFileResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportInterveneFileResponseBody getBody() {
        return this.body;
    }

}
