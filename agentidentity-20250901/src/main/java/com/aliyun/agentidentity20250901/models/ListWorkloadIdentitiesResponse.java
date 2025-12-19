// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListWorkloadIdentitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkloadIdentitiesResponseBody body;

    public static ListWorkloadIdentitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkloadIdentitiesResponse self = new ListWorkloadIdentitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkloadIdentitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkloadIdentitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkloadIdentitiesResponse setBody(ListWorkloadIdentitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkloadIdentitiesResponseBody getBody() {
        return this.body;
    }

}
