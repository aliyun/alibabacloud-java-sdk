// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateAxgGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAxgGroupResponseBody body;

    public static CreateAxgGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAxgGroupResponse self = new CreateAxgGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAxgGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAxgGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAxgGroupResponse setBody(CreateAxgGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAxgGroupResponseBody getBody() {
        return this.body;
    }

}
