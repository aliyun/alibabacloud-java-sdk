// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSemanticJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSemanticJobsResponseBody body;

    public static ListSemanticJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticJobsResponse self = new ListSemanticJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListSemanticJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSemanticJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSemanticJobsResponse setBody(ListSemanticJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSemanticJobsResponseBody getBody() {
        return this.body;
    }

}
