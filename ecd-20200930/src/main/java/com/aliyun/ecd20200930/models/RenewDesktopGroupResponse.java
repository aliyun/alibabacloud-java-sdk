// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RenewDesktopGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RenewDesktopGroupResponse setBody(RenewDesktopGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewDesktopGroupResponseBody getBody() {
        return this.body;
    }

}
