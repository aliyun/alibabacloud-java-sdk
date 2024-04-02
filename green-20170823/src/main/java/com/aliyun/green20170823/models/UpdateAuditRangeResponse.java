// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateAuditRangeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAuditRangeResponseBody body;

    public static UpdateAuditRangeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuditRangeResponse self = new UpdateAuditRangeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAuditRangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAuditRangeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAuditRangeResponse setBody(UpdateAuditRangeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAuditRangeResponseBody getBody() {
        return this.body;
    }

}
