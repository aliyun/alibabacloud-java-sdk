// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditUserConfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditUserConfResponseBody body;

    public static GetAuditUserConfResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditUserConfResponse self = new GetAuditUserConfResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditUserConfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditUserConfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditUserConfResponse setBody(GetAuditUserConfResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditUserConfResponseBody getBody() {
        return this.body;
    }

}
