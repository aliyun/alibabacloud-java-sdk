// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DisableDesktopsInGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDesktopsInGroupResponseBody body;

    public static DisableDesktopsInGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDesktopsInGroupResponse self = new DisableDesktopsInGroupResponse();
        return TeaModel.build(map, self);
    }

    public DisableDesktopsInGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDesktopsInGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDesktopsInGroupResponse setBody(DisableDesktopsInGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDesktopsInGroupResponseBody getBody() {
        return this.body;
    }

}
