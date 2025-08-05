// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class RenameNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameNodeResponseBody body;

    public static RenameNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameNodeResponse self = new RenameNodeResponse();
        return TeaModel.build(map, self);
    }

    public RenameNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameNodeResponse setBody(RenameNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameNodeResponseBody getBody() {
        return this.body;
    }

}
