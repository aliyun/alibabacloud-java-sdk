// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOTAJobResponseBody body;

    public static QueryOTAJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAJobResponse self = new QueryOTAJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryOTAJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOTAJobResponse setBody(QueryOTAJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOTAJobResponseBody getBody() {
        return this.body;
    }

}
