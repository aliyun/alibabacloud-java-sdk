// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class AddLabReservedResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLabReservedResponseBody body;

    public static AddLabReservedResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLabReservedResponse self = new AddLabReservedResponse();
        return TeaModel.build(map, self);
    }

    public AddLabReservedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLabReservedResponse setBody(AddLabReservedResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLabReservedResponseBody getBody() {
        return this.body;
    }

}
