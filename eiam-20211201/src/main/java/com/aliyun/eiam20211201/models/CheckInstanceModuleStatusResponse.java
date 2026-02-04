// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CheckInstanceModuleStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInstanceModuleStatusResponseBody body;

    public static CheckInstanceModuleStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceModuleStatusResponse self = new CheckInstanceModuleStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceModuleStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceModuleStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInstanceModuleStatusResponse setBody(CheckInstanceModuleStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceModuleStatusResponseBody getBody() {
        return this.body;
    }

}
