// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateCommonGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateCommonGroupResponseBody body;

    public static CreateCommonGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommonGroupResponse self = new CreateCommonGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommonGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommonGroupResponse setBody(CreateCommonGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommonGroupResponseBody getBody() {
        return this.body;
    }

}
