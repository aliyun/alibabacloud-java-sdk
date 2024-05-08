// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTaskGroupResponseBody body;

    public static CreateTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskGroupResponse self = new CreateTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTaskGroupResponse setBody(CreateTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTaskGroupResponseBody getBody() {
        return this.body;
    }

}
