// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QuerySplitItemBillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySplitItemBillResponseBody body;

    public static QuerySplitItemBillResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySplitItemBillResponse self = new QuerySplitItemBillResponse();
        return TeaModel.build(map, self);
    }

    public QuerySplitItemBillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySplitItemBillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySplitItemBillResponse setBody(QuerySplitItemBillResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySplitItemBillResponseBody getBody() {
        return this.body;
    }

}
