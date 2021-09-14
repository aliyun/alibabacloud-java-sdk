// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class QueryHostBaseInfoByInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHostBaseInfoByInstanceResponseBody body;

    public static QueryHostBaseInfoByInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHostBaseInfoByInstanceResponse self = new QueryHostBaseInfoByInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHostBaseInfoByInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHostBaseInfoByInstanceResponse setBody(QueryHostBaseInfoByInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHostBaseInfoByInstanceResponseBody getBody() {
        return this.body;
    }

}
