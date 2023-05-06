// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class CreateAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAppGroupResponseBody body;

    public static CreateAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppGroupResponse self = new CreateAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppGroupResponse setBody(CreateAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppGroupResponseBody getBody() {
        return this.body;
    }

}
