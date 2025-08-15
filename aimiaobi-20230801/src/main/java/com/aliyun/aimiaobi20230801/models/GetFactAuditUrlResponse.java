// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetFactAuditUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFactAuditUrlResponseBody body;

    public static GetFactAuditUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFactAuditUrlResponse self = new GetFactAuditUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetFactAuditUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFactAuditUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFactAuditUrlResponse setBody(GetFactAuditUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFactAuditUrlResponseBody getBody() {
        return this.body;
    }

}
