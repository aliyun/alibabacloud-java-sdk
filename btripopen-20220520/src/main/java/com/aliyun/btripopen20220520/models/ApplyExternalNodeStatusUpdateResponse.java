// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ApplyExternalNodeStatusUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyExternalNodeStatusUpdateResponseBody body;

    public static ApplyExternalNodeStatusUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyExternalNodeStatusUpdateResponse self = new ApplyExternalNodeStatusUpdateResponse();
        return TeaModel.build(map, self);
    }

    public ApplyExternalNodeStatusUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyExternalNodeStatusUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyExternalNodeStatusUpdateResponse setBody(ApplyExternalNodeStatusUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyExternalNodeStatusUpdateResponseBody getBody() {
        return this.body;
    }

}
