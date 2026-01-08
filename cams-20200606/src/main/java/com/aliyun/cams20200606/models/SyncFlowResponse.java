// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SyncFlowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncFlowResponseBody body;

    public static SyncFlowResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncFlowResponse self = new SyncFlowResponse();
        return TeaModel.build(map, self);
    }

    public SyncFlowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncFlowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncFlowResponse setBody(SyncFlowResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncFlowResponseBody getBody() {
        return this.body;
    }

}
