// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class AddUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUsersResponseBody body;

    public static AddUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUsersResponse self = new AddUsersResponse();
        return TeaModel.build(map, self);
    }

    public AddUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUsersResponse setBody(AddUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUsersResponseBody getBody() {
        return this.body;
    }

}
