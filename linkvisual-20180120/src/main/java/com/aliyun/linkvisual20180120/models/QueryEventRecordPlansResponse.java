// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryEventRecordPlansResponseBody body;

    public static QueryEventRecordPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlansResponse self = new QueryEventRecordPlansResponse();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryEventRecordPlansResponse setBody(QueryEventRecordPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryEventRecordPlansResponseBody getBody() {
        return this.body;
    }

}
