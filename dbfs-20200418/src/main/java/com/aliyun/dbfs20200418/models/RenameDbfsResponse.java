// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class RenameDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RenameDbfsResponse setBody(RenameDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public RenameDbfsResponseBody getBody() {
        return this.body;
    }

}
