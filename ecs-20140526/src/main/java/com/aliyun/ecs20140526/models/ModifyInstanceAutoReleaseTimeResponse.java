// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoReleaseTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceAutoReleaseTimeResponseBody body;

    public static ModifyInstanceAutoReleaseTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoReleaseTimeResponse self = new ModifyInstanceAutoReleaseTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoReleaseTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAutoReleaseTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceAutoReleaseTimeResponse setBody(ModifyInstanceAutoReleaseTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAutoReleaseTimeResponseBody getBody() {
        return this.body;
    }

}
