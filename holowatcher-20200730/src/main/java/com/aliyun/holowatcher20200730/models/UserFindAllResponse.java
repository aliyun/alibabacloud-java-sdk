// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserFindAllResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public UserFindAllResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserFindAllResponse setBody(UserFindAllResponseBody body) {
        this.body = body;
        return this;
    }
    public UserFindAllResponseBody getBody() {
        return this.body;
    }

}
