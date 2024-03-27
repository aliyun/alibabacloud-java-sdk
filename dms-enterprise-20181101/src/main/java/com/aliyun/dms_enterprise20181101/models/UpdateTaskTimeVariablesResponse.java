// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateTaskTimeVariablesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTaskTimeVariablesResponseBody body;

    public static UpdateTaskTimeVariablesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskTimeVariablesResponse self = new UpdateTaskTimeVariablesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTaskTimeVariablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTaskTimeVariablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTaskTimeVariablesResponse setBody(UpdateTaskTimeVariablesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTaskTimeVariablesResponseBody getBody() {
        return this.body;
    }

}
