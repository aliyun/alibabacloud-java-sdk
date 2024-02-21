// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateNodeGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNodeGroupResponseBody body;

    public static CreateNodeGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNodeGroupResponse self = new CreateNodeGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateNodeGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNodeGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNodeGroupResponse setBody(CreateNodeGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNodeGroupResponseBody getBody() {
        return this.body;
    }

}
