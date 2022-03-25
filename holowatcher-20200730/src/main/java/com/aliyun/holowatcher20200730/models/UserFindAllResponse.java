// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UserFindAllResponseBody body;

    public static UserFindAllResponse build(java.util.Map<String, ?> map) throws Exception {
        UserFindAllResponse self = new UserFindAllResponse();
        return TeaModel.build(map, self);
    }

    public UserFindAllResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserFindAllResponse setBody(UserFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public UserFindAllResponseBody getBody() {
        return this.body;
    }

}
