// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ModifyMPCoSPhaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMPCoSPhaseResponseBody body;

    public static ModifyMPCoSPhaseResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMPCoSPhaseResponse self = new ModifyMPCoSPhaseResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMPCoSPhaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMPCoSPhaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMPCoSPhaseResponse setBody(ModifyMPCoSPhaseResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMPCoSPhaseResponseBody getBody() {
        return this.body;
    }

}
