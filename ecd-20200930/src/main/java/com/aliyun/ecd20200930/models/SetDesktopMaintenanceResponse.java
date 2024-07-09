// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetDesktopMaintenanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDesktopMaintenanceResponseBody body;

    public static SetDesktopMaintenanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDesktopMaintenanceResponse self = new SetDesktopMaintenanceResponse();
        return TeaModel.build(map, self);
    }

    public SetDesktopMaintenanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDesktopMaintenanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDesktopMaintenanceResponse setBody(SetDesktopMaintenanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDesktopMaintenanceResponseBody getBody() {
        return this.body;
    }

}
