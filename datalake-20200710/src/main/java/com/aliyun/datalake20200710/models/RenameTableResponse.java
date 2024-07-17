// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RenameTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameTableResponseBody body;

    public static RenameTableResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameTableResponse self = new RenameTableResponse();
        return TeaModel.build(map, self);
    }

    public RenameTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameTableResponse setBody(RenameTableResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameTableResponseBody getBody() {
        return this.body;
    }

}
