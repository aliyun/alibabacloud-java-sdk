// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateCustomGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomGroupResponseBody body;

    public static CreateCustomGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomGroupResponse self = new CreateCustomGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomGroupResponse setBody(CreateCustomGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomGroupResponseBody getBody() {
        return this.body;
    }

}
