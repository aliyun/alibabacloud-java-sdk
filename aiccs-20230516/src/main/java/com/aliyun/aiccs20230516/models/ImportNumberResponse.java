// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class ImportNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ImportNumberResponseBody body;

    public static ImportNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportNumberResponse self = new ImportNumberResponse();
        return TeaModel.build(map, self);
    }

    public ImportNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ImportNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ImportNumberResponse setBody(ImportNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ImportNumberResponseBody getBody() {
        return this.body;
    }

}
