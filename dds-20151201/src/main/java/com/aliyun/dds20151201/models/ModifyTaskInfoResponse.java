// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyTaskInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTaskInfoResponseBody body;

    public static ModifyTaskInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTaskInfoResponse self = new ModifyTaskInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTaskInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTaskInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTaskInfoResponse setBody(ModifyTaskInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTaskInfoResponseBody getBody() {
        return this.body;
    }

}
