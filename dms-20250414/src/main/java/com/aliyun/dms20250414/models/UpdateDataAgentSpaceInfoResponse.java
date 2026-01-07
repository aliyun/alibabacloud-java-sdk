// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentSpaceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataAgentSpaceInfoResponseBody body;

    public static UpdateDataAgentSpaceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentSpaceInfoResponse self = new UpdateDataAgentSpaceInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentSpaceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataAgentSpaceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataAgentSpaceInfoResponse setBody(UpdateDataAgentSpaceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataAgentSpaceInfoResponseBody getBody() {
        return this.body;
    }

}
