// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDtsJobConfigResponseBody body;

    public static ModifyDtsJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobConfigResponse self = new ModifyDtsJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDtsJobConfigResponse setBody(ModifyDtsJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobConfigResponseBody getBody() {
        return this.body;
    }

}
