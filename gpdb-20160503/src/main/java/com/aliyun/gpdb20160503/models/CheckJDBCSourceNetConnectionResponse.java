// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CheckJDBCSourceNetConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckJDBCSourceNetConnectionResponseBody body;

    public static CheckJDBCSourceNetConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckJDBCSourceNetConnectionResponse self = new CheckJDBCSourceNetConnectionResponse();
        return TeaModel.build(map, self);
    }

    public CheckJDBCSourceNetConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckJDBCSourceNetConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckJDBCSourceNetConnectionResponse setBody(CheckJDBCSourceNetConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckJDBCSourceNetConnectionResponseBody getBody() {
        return this.body;
    }

}
