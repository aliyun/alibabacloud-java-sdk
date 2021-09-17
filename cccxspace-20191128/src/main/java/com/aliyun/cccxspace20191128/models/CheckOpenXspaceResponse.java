// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckOpenXspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckOpenXspaceResponseBody body;

    public static CheckOpenXspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOpenXspaceResponse self = new CheckOpenXspaceResponse();
        return TeaModel.build(map, self);
    }

    public CheckOpenXspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOpenXspaceResponse setBody(CheckOpenXspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOpenXspaceResponseBody getBody() {
        return this.body;
    }

}
