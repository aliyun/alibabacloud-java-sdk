// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateResource02Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateResource02ResponseBody body;

    public static CreateResource02Response build(java.util.Map<String, ?> map) throws Exception {
        CreateResource02Response self = new CreateResource02Response();
        return TeaModel.build(map, self);
    }

    public CreateResource02Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateResource02Response setBody(CreateResource02ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateResource02ResponseBody getBody() {
        return this.body;
    }

}
