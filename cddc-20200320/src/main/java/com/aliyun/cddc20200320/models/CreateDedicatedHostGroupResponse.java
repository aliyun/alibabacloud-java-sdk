// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class CreateDedicatedHostGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDedicatedHostGroupResponseBody body;

    public static CreateDedicatedHostGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedHostGroupResponse self = new CreateDedicatedHostGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedHostGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedHostGroupResponse setBody(CreateDedicatedHostGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedHostGroupResponseBody getBody() {
        return this.body;
    }

}
