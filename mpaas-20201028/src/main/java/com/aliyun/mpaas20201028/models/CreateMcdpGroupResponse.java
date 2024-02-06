// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcdpGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcdpGroupResponseBody body;

    public static CreateMcdpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcdpGroupResponse self = new CreateMcdpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcdpGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcdpGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcdpGroupResponse setBody(CreateMcdpGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcdpGroupResponseBody getBody() {
        return this.body;
    }

}
