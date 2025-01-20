// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnbindConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindConfigGroupResponseBody body;

    public static UnbindConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindConfigGroupResponse self = new UnbindConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public UnbindConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindConfigGroupResponse setBody(UnbindConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindConfigGroupResponseBody getBody() {
        return this.body;
    }

}
