// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePurifyPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDevicePurifyPlansResponseBody body;

    public static QueryDevicePurifyPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePurifyPlansResponse self = new QueryDevicePurifyPlansResponse();
        return TeaModel.build(map, self);
    }

    public QueryDevicePurifyPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDevicePurifyPlansResponse setBody(QueryDevicePurifyPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDevicePurifyPlansResponseBody getBody() {
        return this.body;
    }

}
