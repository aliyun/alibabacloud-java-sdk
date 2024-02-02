// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BindDriverToEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindDriverToEdgeInstanceResponseBody body;

    public static BindDriverToEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDriverToEdgeInstanceResponse self = new BindDriverToEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public BindDriverToEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDriverToEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindDriverToEdgeInstanceResponse setBody(BindDriverToEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDriverToEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
