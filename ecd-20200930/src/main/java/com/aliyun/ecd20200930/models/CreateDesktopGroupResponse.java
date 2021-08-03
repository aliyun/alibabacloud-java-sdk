// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDesktopGroupResponseBody body;

    public static CreateDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopGroupResponse self = new CreateDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDesktopGroupResponse setBody(CreateDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
