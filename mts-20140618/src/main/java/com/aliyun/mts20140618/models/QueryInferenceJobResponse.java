// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInferenceJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInferenceJobResponseBody body;

    public static QueryInferenceJobResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInferenceJobResponse self = new QueryInferenceJobResponse();
        return TeaModel.build(map, self);
    }

    public QueryInferenceJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInferenceJobResponse setBody(QueryInferenceJobResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInferenceJobResponseBody getBody() {
        return this.body;
    }

}
