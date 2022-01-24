// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class AddShopsToGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddShopsToGroupResponseBody body;

    public static AddShopsToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AddShopsToGroupResponse self = new AddShopsToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AddShopsToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddShopsToGroupResponse setBody(AddShopsToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AddShopsToGroupResponseBody getBody() {
        return this.body;
    }

}
