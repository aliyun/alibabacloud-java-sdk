// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyWebAreaBlockSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyWebAreaBlockSwitchResponseBody body;

    public static ModifyWebAreaBlockSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebAreaBlockSwitchResponse self = new ModifyWebAreaBlockSwitchResponse();
        return TeaModel.build(map, self);
    }

    public ModifyWebAreaBlockSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyWebAreaBlockSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyWebAreaBlockSwitchResponse setBody(ModifyWebAreaBlockSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyWebAreaBlockSwitchResponseBody getBody() {
        return this.body;
    }

}
