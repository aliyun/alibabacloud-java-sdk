// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobDuLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDtsJobDuLimitResponseBody body;

    public static ModifyDtsJobDuLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobDuLimitResponse self = new ModifyDtsJobDuLimitResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobDuLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobDuLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDtsJobDuLimitResponse setBody(ModifyDtsJobDuLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobDuLimitResponseBody getBody() {
        return this.body;
    }

}
