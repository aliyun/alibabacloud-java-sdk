// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAggTaskGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAggTaskGroupResponseBody body;

    public static CreateAggTaskGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAggTaskGroupResponse self = new CreateAggTaskGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAggTaskGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAggTaskGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAggTaskGroupResponse setBody(CreateAggTaskGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAggTaskGroupResponseBody getBody() {
        return this.body;
    }

}
