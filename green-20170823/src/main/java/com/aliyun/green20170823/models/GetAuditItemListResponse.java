// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditItemListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuditItemListResponseBody body;

    public static GetAuditItemListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuditItemListResponse self = new GetAuditItemListResponse();
        return TeaModel.build(map, self);
    }

    public GetAuditItemListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuditItemListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuditItemListResponse setBody(GetAuditItemListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuditItemListResponseBody getBody() {
        return this.body;
    }

}
