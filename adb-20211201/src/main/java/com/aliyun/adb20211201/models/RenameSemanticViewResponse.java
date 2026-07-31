// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RenameSemanticViewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameSemanticViewResponseBody body;

    public static RenameSemanticViewResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameSemanticViewResponse self = new RenameSemanticViewResponse();
        return TeaModel.build(map, self);
    }

    public RenameSemanticViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameSemanticViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameSemanticViewResponse setBody(RenameSemanticViewResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameSemanticViewResponseBody getBody() {
        return this.body;
    }

}
