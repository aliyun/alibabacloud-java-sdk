// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyDefaultIPSConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefaultIPSConfigResponseBody body;

    public static ModifyDefaultIPSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultIPSConfigResponse self = new ModifyDefaultIPSConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultIPSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefaultIPSConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefaultIPSConfigResponse setBody(ModifyDefaultIPSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefaultIPSConfigResponseBody getBody() {
        return this.body;
    }

}
