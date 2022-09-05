// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class GetLeadsListPageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLeadsListPageResponseBody body;

    public static GetLeadsListPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLeadsListPageResponse self = new GetLeadsListPageResponse();
        return TeaModel.build(map, self);
    }

    public GetLeadsListPageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLeadsListPageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLeadsListPageResponse setBody(GetLeadsListPageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLeadsListPageResponseBody getBody() {
        return this.body;
    }

}
