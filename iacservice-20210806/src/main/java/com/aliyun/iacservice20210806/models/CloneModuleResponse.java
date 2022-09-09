// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CloneModuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloneModuleResponseBody body;

    public static CloneModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneModuleResponse self = new CloneModuleResponse();
        return TeaModel.build(map, self);
    }

    public CloneModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneModuleResponse setBody(CloneModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneModuleResponseBody getBody() {
        return this.body;
    }

}
