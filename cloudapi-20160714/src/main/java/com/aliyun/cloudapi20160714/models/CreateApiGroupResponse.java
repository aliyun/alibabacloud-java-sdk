// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class CreateApiGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateApiGroupResponseBody body;

    public static CreateApiGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApiGroupResponse self = new CreateApiGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateApiGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApiGroupResponse setBody(CreateApiGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApiGroupResponseBody getBody() {
        return this.body;
    }

}
