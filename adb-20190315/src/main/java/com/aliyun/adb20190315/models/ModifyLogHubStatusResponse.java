// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyLogHubStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLogHubStatusResponseBody body;

    public static ModifyLogHubStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogHubStatusResponse self = new ModifyLogHubStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLogHubStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLogHubStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLogHubStatusResponse setBody(ModifyLogHubStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLogHubStatusResponseBody getBody() {
        return this.body;
    }

}
