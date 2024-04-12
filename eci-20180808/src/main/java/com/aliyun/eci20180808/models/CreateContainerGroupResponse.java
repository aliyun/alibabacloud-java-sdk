// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateContainerGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateContainerGroupResponseBody body;

    public static CreateContainerGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateContainerGroupResponse self = new CreateContainerGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateContainerGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateContainerGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateContainerGroupResponse setBody(CreateContainerGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateContainerGroupResponseBody getBody() {
        return this.body;
    }

}
