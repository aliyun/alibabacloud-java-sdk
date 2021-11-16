// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeleteServiceGroupUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteServiceGroupUserResponseBody body;

    public static DeleteServiceGroupUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceGroupUserResponse self = new DeleteServiceGroupUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceGroupUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteServiceGroupUserResponse setBody(DeleteServiceGroupUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteServiceGroupUserResponseBody getBody() {
        return this.body;
    }

}
