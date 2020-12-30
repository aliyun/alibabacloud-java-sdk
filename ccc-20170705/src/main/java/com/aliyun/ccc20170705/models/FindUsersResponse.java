// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class FindUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FindUsersResponseBody body;

    public static FindUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        FindUsersResponse self = new FindUsersResponse();
        return TeaModel.build(map, self);
    }

    public FindUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindUsersResponse setBody(FindUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public FindUsersResponseBody getBody() {
        return this.body;
    }

}
