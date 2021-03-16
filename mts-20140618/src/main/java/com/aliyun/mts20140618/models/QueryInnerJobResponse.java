// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInnerJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInnerJobResponseBody body;

    public static QueryInnerJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerJobResponse self = new QueryInnerJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInnerJobResponse setBody(QueryInnerJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInnerJobResponseBody getBody() {
        return this.body;
    }

}
