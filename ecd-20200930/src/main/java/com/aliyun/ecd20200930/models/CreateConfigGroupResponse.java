// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateConfigGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateConfigGroupResponseBody body;

    public static CreateConfigGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigGroupResponse self = new CreateConfigGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateConfigGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConfigGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConfigGroupResponse setBody(CreateConfigGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConfigGroupResponseBody getBody() {
        return this.body;
    }

}
