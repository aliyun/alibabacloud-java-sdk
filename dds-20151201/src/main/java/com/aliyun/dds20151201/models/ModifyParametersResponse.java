// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyParametersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyParametersResponseBody body;

    public static ModifyParametersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyParametersResponse self = new ModifyParametersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyParametersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyParametersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyParametersResponse setBody(ModifyParametersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyParametersResponseBody getBody() {
        return this.body;
    }

}
