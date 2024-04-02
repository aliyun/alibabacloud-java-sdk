// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditItemDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditItemDetailResponseBody body;

    public static GetAuditItemDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditItemDetailResponse self = new GetAuditItemDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditItemDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditItemDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditItemDetailResponse setBody(GetAuditItemDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditItemDetailResponseBody getBody() {
        return this.body;
    }

}
