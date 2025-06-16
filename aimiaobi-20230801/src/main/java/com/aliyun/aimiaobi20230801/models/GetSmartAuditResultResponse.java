// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetSmartAuditResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSmartAuditResultResponseBody body;

    public static GetSmartAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSmartAuditResultResponse self = new GetSmartAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public GetSmartAuditResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSmartAuditResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSmartAuditResultResponse setBody(GetSmartAuditResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSmartAuditResultResponseBody getBody() {
        return this.body;
    }

}
