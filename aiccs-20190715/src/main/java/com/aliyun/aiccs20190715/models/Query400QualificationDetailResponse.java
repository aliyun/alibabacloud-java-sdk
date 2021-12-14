// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Query400QualificationDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public Query400QualificationDetailResponseBody body;

    public static Query400QualificationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        Query400QualificationDetailResponse self = new Query400QualificationDetailResponse();
        return TeaModel.build(map, self);
    }

    public Query400QualificationDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Query400QualificationDetailResponse setBody(Query400QualificationDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public Query400QualificationDetailResponseBody getBody() {
        return this.body;
    }

}
