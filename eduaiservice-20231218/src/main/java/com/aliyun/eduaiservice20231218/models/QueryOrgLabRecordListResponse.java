// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduaiservice20231218.models;

import com.aliyun.tea.*;

public class QueryOrgLabRecordListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryOrgLabRecordListResponseBody body;

    public static QueryOrgLabRecordListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrgLabRecordListResponse self = new QueryOrgLabRecordListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrgLabRecordListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrgLabRecordListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrgLabRecordListResponse setBody(QueryOrgLabRecordListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrgLabRecordListResponseBody getBody() {
        return this.body;
    }

}
