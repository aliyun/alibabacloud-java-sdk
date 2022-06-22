// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class TransWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TransWorkspaceResponseBody body;

    public static TransWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        TransWorkspaceResponse self = new TransWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public TransWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransWorkspaceResponse setBody(TransWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public TransWorkspaceResponseBody getBody() {
        return this.body;
    }

}
