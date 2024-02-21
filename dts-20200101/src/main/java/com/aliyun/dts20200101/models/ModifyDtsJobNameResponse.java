// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDtsJobNameResponseBody body;

    public static ModifyDtsJobNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobNameResponse self = new ModifyDtsJobNameResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDtsJobNameResponse setBody(ModifyDtsJobNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobNameResponseBody getBody() {
        return this.body;
    }

}
