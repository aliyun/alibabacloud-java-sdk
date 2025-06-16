// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAuditContentErrorTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuditContentErrorTypesResponseBody body;

    public static ListAuditContentErrorTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuditContentErrorTypesResponse self = new ListAuditContentErrorTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListAuditContentErrorTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuditContentErrorTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuditContentErrorTypesResponse setBody(ListAuditContentErrorTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuditContentErrorTypesResponseBody getBody() {
        return this.body;
    }

}
