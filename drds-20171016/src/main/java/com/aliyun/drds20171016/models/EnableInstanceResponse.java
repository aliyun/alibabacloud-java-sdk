// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class EnableInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableInstanceResponseBody body;

    public static EnableInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInstanceResponse self = new EnableInstanceResponse();
        return TeaModel.build(map, self);
    }

    public EnableInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInstanceResponse setBody(EnableInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInstanceResponseBody getBody() {
        return this.body;
    }

}
