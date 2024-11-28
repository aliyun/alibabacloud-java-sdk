// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewDesktopGroupResponseBody body;

    public static RenewDesktopGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewDesktopGroupResponse self = new RenewDesktopGroupResponse();
        return TeaModel.build(map, self);
    }

    public RenewDesktopGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewDesktopGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewDesktopGroupResponse setBody(RenewDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
