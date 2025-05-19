// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ModifyTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTaskResponseBody body;

    public static ModifyTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTaskResponse self = new ModifyTaskResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTaskResponse setBody(ModifyTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTaskResponseBody getBody() {
        return this.body;
    }

}
