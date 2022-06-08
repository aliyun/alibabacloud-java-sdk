// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataCorrectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExecuteDataCorrectResponseBody body;

    public static ExecuteDataCorrectResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataCorrectResponse self = new ExecuteDataCorrectResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteDataCorrectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteDataCorrectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteDataCorrectResponse setBody(ExecuteDataCorrectResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteDataCorrectResponseBody getBody() {
        return this.body;
    }

}
