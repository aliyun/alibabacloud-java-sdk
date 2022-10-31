// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateMessageGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMessageGroupResponseBody body;

    public static CreateMessageGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMessageGroupResponse self = new CreateMessageGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMessageGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMessageGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMessageGroupResponse setBody(CreateMessageGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMessageGroupResponseBody getBody() {
        return this.body;
    }

}
