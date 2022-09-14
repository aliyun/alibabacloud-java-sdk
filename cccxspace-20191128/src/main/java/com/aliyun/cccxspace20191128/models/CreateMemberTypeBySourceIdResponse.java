// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateMemberTypeBySourceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMemberTypeBySourceIdResponseBody body;

    public static CreateMemberTypeBySourceIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberTypeBySourceIdResponse self = new CreateMemberTypeBySourceIdResponse();
        return TeaModel.build(map, self);
    }

    public CreateMemberTypeBySourceIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMemberTypeBySourceIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMemberTypeBySourceIdResponse setBody(CreateMemberTypeBySourceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemberTypeBySourceIdResponseBody getBody() {
        return this.body;
    }

}
