// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListSemanticJobRunsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSemanticJobRunsResponseBody body;

    public static ListSemanticJobRunsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSemanticJobRunsResponse self = new ListSemanticJobRunsResponse();
        return TeaModel.build(map, self);
    }

    public ListSemanticJobRunsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSemanticJobRunsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSemanticJobRunsResponse setBody(ListSemanticJobRunsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSemanticJobRunsResponseBody getBody() {
        return this.body;
    }

}
