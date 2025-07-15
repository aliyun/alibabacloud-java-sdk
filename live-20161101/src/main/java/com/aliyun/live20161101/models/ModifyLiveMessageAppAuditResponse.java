// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveMessageAppAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyLiveMessageAppAuditResponseBody body;

    public static ModifyLiveMessageAppAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveMessageAppAuditResponse self = new ModifyLiveMessageAppAuditResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveMessageAppAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyLiveMessageAppAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyLiveMessageAppAuditResponse setBody(ModifyLiveMessageAppAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyLiveMessageAppAuditResponseBody getBody() {
        return this.body;
    }

}
