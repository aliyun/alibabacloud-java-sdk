// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecKgCypherResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecKgCypherResponseBody body;

    public static ExecKgCypherResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecKgCypherResponse self = new ExecKgCypherResponse();
        return TeaModel.build(map, self);
    }

    public ExecKgCypherResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecKgCypherResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecKgCypherResponse setBody(ExecKgCypherResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecKgCypherResponseBody getBody() {
        return this.body;
    }

}
