// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFacerecogJobListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryFacerecogJobListResponseBody body;

    public static QueryFacerecogJobListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFacerecogJobListResponse self = new QueryFacerecogJobListResponse();
        return TeaModel.build(map, self);
    }

    public QueryFacerecogJobListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryFacerecogJobListResponse setBody(QueryFacerecogJobListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryFacerecogJobListResponseBody getBody() {
        return this.body;
    }

}
