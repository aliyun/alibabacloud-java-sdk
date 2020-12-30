// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class QueryPersonalInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPersonalInfoResponseBody body;

    public static QueryPersonalInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPersonalInfoResponse self = new QueryPersonalInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryPersonalInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPersonalInfoResponse setBody(QueryPersonalInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPersonalInfoResponseBody getBody() {
        return this.body;
    }

}
