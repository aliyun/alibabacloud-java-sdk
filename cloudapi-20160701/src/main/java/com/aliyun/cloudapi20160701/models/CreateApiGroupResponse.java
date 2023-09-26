// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class CreateApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateApiGroupResponseBody body;

    public static CreateApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiGroupResponse self = new CreateApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApiGroupResponse setBody(CreateApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiGroupResponseBody getBody() {
        return this.body;
    }

}
