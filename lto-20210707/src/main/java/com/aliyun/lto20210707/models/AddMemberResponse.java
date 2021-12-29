// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class AddMemberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMemberResponseBody body;

    public static AddMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMemberResponse self = new AddMemberResponse();
        return TeaModel.build(map, self);
    }

    public AddMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMemberResponse setBody(AddMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMemberResponseBody getBody() {
        return this.body;
    }

}
