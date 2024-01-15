// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopOversoldGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RenewDesktopOversoldGroupResponseBody body;

    public static RenewDesktopOversoldGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopOversoldGroupResponse self = new RenewDesktopOversoldGroupResponse();
        return TeaModel.build(map, self);
    }

    public RenewDesktopOversoldGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewDesktopOversoldGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewDesktopOversoldGroupResponse setBody(RenewDesktopOversoldGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewDesktopOversoldGroupResponseBody getBody() {
        return this.body;
    }

}
