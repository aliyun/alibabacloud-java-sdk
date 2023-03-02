// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ModifyMPCoSPhaseGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyMPCoSPhaseGroupResponseBody body;

    public static ModifyMPCoSPhaseGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyMPCoSPhaseGroupResponse self = new ModifyMPCoSPhaseGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyMPCoSPhaseGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyMPCoSPhaseGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyMPCoSPhaseGroupResponse setBody(ModifyMPCoSPhaseGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyMPCoSPhaseGroupResponseBody getBody() {
        return this.body;
    }

}
