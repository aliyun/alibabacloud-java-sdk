// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ModifyInstanceVswitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceVswitchResponseBody body;

    public static ModifyInstanceVswitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVswitchResponse self = new ModifyInstanceVswitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVswitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVswitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceVswitchResponse setBody(ModifyInstanceVswitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVswitchResponseBody getBody() {
        return this.body;
    }

}
