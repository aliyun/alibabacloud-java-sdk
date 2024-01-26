// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateDesktopGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDesktopGroupResponse setBody(CreateDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
