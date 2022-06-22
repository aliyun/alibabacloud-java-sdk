// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryInspectItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInspectItemResponseBody body;

    public static QueryInspectItemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInspectItemResponse self = new QueryInspectItemResponse();
        return TeaModel.build(map, self);
    }

    public QueryInspectItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInspectItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInspectItemResponse setBody(QueryInspectItemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInspectItemResponseBody getBody() {
        return this.body;
    }

}
