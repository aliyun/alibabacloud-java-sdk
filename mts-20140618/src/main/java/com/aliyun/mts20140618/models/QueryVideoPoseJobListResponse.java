// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoPoseJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryVideoPoseJobListResponseBody body;

    public static QueryVideoPoseJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoPoseJobListResponse self = new QueryVideoPoseJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryVideoPoseJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVideoPoseJobListResponse setBody(QueryVideoPoseJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVideoPoseJobListResponseBody getBody() {
        return this.body;
    }

}
