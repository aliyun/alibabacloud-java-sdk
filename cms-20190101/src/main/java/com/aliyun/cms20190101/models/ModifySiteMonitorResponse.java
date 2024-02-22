// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifySiteMonitorResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifySiteMonitorResponseBody body;

    public static ModifySiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteMonitorResponse self = new ModifySiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public ModifySiteMonitorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySiteMonitorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifySiteMonitorResponse setBody(ModifySiteMonitorResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySiteMonitorResponseBody getBody() {
        return this.body;
    }

}
