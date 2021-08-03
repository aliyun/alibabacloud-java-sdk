// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class OperateVulsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateVulsResponseBody body;

    public static OperateVulsResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateVulsResponse self = new OperateVulsResponse();
        return TeaModel.build(map, self);
    }

    public OperateVulsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateVulsResponse setBody(OperateVulsResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateVulsResponseBody getBody() {
        return this.body;
    }

}
