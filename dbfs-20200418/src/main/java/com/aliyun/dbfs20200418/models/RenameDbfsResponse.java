// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class RenameDbfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenameDbfsResponseBody body;

    public static RenameDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        RenameDbfsResponse self = new RenameDbfsResponse();
        return TeaModel.build(map, self);
    }

    public RenameDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenameDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenameDbfsResponse setBody(RenameDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameDbfsResponseBody getBody() {
        return this.body;
    }

}
