// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UnbindDriverFromEdgeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindDriverFromEdgeInstanceResponseBody body;

    public static UnbindDriverFromEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDriverFromEdgeInstanceResponse self = new UnbindDriverFromEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDriverFromEdgeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDriverFromEdgeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindDriverFromEdgeInstanceResponse setBody(UnbindDriverFromEdgeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDriverFromEdgeInstanceResponseBody getBody() {
        return this.body;
    }

}
