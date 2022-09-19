// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ModifyAdbMySqlDevParametersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAdbMySqlDevParametersResponseBody body;

    public static ModifyAdbMySqlDevParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAdbMySqlDevParametersResponse self = new ModifyAdbMySqlDevParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAdbMySqlDevParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAdbMySqlDevParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAdbMySqlDevParametersResponse setBody(ModifyAdbMySqlDevParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAdbMySqlDevParametersResponseBody getBody() {
        return this.body;
    }

}
