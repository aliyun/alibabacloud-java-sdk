// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateMemberTypeBySourceIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateMemberTypeBySourceIdResponse setBody(CreateMemberTypeBySourceIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMemberTypeBySourceIdResponseBody getBody() {
        return this.body;
    }

}
