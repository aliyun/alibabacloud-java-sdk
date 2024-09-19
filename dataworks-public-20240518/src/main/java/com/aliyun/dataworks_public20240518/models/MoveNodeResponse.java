// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MoveNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MoveNodeResponseBody body;

    public static MoveNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveNodeResponse self = new MoveNodeResponse();
        return TeaModel.build(map, self);
    }

    public MoveNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveNodeResponse setBody(MoveNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveNodeResponseBody getBody() {
        return this.body;
    }

}
