// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindApplicationToEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindApplicationToEdgeInstanceResponseBody body;

    public static BindApplicationToEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindApplicationToEdgeInstanceResponse self = new BindApplicationToEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindApplicationToEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindApplicationToEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindApplicationToEdgeInstanceResponse setBody(BindApplicationToEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindApplicationToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
