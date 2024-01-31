// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ReleaseLindormInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseLindormInstanceResponseBody body;

    public static ReleaseLindormInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLindormInstanceResponse self = new ReleaseLindormInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseLindormInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseLindormInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseLindormInstanceResponse setBody(ReleaseLindormInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseLindormInstanceResponseBody getBody() {
        return this.body;
    }

}
