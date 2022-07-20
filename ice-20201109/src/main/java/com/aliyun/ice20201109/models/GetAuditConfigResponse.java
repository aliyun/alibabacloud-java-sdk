// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetAuditConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuditConfigResponseBody body;

    public static GetAuditConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditConfigResponse self = new GetAuditConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditConfigResponse setBody(GetAuditConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditConfigResponseBody getBody() {
        return this.body;
    }

}
