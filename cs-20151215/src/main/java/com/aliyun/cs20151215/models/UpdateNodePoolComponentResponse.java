// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class UpdateNodePoolComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateNodePoolComponentResponseBody body;

    public static UpdateNodePoolComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodePoolComponentResponse self = new UpdateNodePoolComponentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNodePoolComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNodePoolComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateNodePoolComponentResponse setBody(UpdateNodePoolComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNodePoolComponentResponseBody getBody() {
        return this.body;
    }

}
