// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoQualityJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVideoQualityJobResponseBody body;

    public static QueryVideoQualityJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoQualityJobResponse self = new QueryVideoQualityJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoQualityJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVideoQualityJobResponse setBody(QueryVideoQualityJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVideoQualityJobResponseBody getBody() {
        return this.body;
    }

}
