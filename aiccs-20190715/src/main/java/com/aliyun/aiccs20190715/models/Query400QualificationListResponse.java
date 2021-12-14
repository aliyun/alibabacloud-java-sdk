// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Query400QualificationListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Query400QualificationListResponseBody body;

    public static Query400QualificationListResponse build(java.util.Map<String, ?> map) throws Exception {
        Query400QualificationListResponse self = new Query400QualificationListResponse();
        return TeaModel.build(map, self);
    }

    public Query400QualificationListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Query400QualificationListResponse setBody(Query400QualificationListResponseBody body) {
        this.body = body;
        return this;
    }
    public Query400QualificationListResponseBody getBody() {
        return this.body;
    }

}
