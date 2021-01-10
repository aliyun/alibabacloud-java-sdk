// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryIProductionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIProductionJobResponseBody body;

    public static QueryIProductionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIProductionJobResponse self = new QueryIProductionJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryIProductionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIProductionJobResponse setBody(QueryIProductionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIProductionJobResponseBody getBody() {
        return this.body;
    }

}
