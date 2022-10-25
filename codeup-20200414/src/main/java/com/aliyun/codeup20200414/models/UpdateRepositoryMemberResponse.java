// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UpdateRepositoryMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateRepositoryMemberResponseBody body;

    public static UpdateRepositoryMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRepositoryMemberResponse self = new UpdateRepositoryMemberResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRepositoryMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRepositoryMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRepositoryMemberResponse setBody(UpdateRepositoryMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRepositoryMemberResponseBody getBody() {
        return this.body;
    }

}
