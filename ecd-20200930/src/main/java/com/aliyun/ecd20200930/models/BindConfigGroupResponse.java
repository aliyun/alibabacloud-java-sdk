// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class BindConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindConfigGroupResponseBody body;

    public static BindConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        BindConfigGroupResponse self = new BindConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public BindConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindConfigGroupResponse setBody(BindConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public BindConfigGroupResponseBody getBody() {
        return this.body;
    }

}
