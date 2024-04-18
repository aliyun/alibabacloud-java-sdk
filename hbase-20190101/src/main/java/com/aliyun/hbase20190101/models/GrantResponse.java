// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class GrantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GrantResponseBody body;

    public static GrantResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantResponse self = new GrantResponse();
        return TeaModel.build(map, self);
    }

    public GrantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantResponse setBody(GrantResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantResponseBody getBody() {
        return this.body;
    }

}
