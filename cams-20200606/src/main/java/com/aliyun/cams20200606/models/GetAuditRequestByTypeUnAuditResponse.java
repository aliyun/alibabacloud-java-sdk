// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetAuditRequestByTypeUnAuditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditRequestByTypeUnAuditResponseBody body;

    public static GetAuditRequestByTypeUnAuditResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditRequestByTypeUnAuditResponse self = new GetAuditRequestByTypeUnAuditResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditRequestByTypeUnAuditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditRequestByTypeUnAuditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditRequestByTypeUnAuditResponse setBody(GetAuditRequestByTypeUnAuditResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditRequestByTypeUnAuditResponseBody getBody() {
        return this.body;
    }

}
