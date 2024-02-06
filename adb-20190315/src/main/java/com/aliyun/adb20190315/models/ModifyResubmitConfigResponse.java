// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class ModifyResubmitConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyResubmitConfigResponseBody body;

    public static ModifyResubmitConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyResubmitConfigResponse self = new ModifyResubmitConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyResubmitConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyResubmitConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyResubmitConfigResponse setBody(ModifyResubmitConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyResubmitConfigResponseBody getBody() {
        return this.body;
    }

}
