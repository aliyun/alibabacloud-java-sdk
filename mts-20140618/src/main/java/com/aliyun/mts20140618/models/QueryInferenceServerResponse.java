// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryInferenceServerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInferenceServerResponseBody body;

    public static QueryInferenceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInferenceServerResponse self = new QueryInferenceServerResponse();
        return TeaModel.build(map, self);
    }

    public QueryInferenceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInferenceServerResponse setBody(QueryInferenceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInferenceServerResponseBody getBody() {
        return this.body;
    }

}
