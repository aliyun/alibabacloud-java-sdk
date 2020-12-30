// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUsersResponseBody body;

    public static CreateUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUsersResponse self = new CreateUsersResponse();
        return TeaModel.build(map, self);
    }

    public CreateUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUsersResponse setBody(CreateUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUsersResponseBody getBody() {
        return this.body;
    }

}
