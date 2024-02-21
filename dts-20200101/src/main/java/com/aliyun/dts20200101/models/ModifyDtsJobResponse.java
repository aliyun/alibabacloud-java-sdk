// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDtsJobResponseBody body;

    public static ModifyDtsJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobResponse self = new ModifyDtsJobResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDtsJobResponse setBody(ModifyDtsJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobResponseBody getBody() {
        return this.body;
    }

}
