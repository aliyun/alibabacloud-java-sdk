// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetCorpAccomplishmentTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCorpAccomplishmentTasksResponseBody body;

    public static GetCorpAccomplishmentTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCorpAccomplishmentTasksResponse self = new GetCorpAccomplishmentTasksResponse();
        return TeaModel.build(map, self);
    }

    public GetCorpAccomplishmentTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCorpAccomplishmentTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCorpAccomplishmentTasksResponse setBody(GetCorpAccomplishmentTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCorpAccomplishmentTasksResponseBody getBody() {
        return this.body;
    }

}
