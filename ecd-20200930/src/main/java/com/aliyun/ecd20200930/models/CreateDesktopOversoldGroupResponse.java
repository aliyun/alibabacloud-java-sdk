// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopOversoldGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDesktopOversoldGroupResponseBody body;

    public static CreateDesktopOversoldGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDesktopOversoldGroupResponse self = new CreateDesktopOversoldGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDesktopOversoldGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDesktopOversoldGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDesktopOversoldGroupResponse setBody(CreateDesktopOversoldGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDesktopOversoldGroupResponseBody getBody() {
        return this.body;
    }

}
