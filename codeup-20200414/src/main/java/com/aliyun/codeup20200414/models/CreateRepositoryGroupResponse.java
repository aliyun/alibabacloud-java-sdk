// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepositoryGroupResponseBody body;

    public static CreateRepositoryGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryGroupResponse self = new CreateRepositoryGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepositoryGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepositoryGroupResponse setBody(CreateRepositoryGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepositoryGroupResponseBody getBody() {
        return this.body;
    }

}
