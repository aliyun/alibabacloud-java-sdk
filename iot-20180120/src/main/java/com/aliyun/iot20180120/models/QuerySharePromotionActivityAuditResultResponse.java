// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySharePromotionActivityAuditResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySharePromotionActivityAuditResultResponseBody body;

    public static QuerySharePromotionActivityAuditResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySharePromotionActivityAuditResultResponse self = new QuerySharePromotionActivityAuditResultResponse();
        return TeaModel.build(map, self);
    }

    public QuerySharePromotionActivityAuditResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySharePromotionActivityAuditResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySharePromotionActivityAuditResultResponse setBody(QuerySharePromotionActivityAuditResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySharePromotionActivityAuditResultResponseBody getBody() {
        return this.body;
    }

}
