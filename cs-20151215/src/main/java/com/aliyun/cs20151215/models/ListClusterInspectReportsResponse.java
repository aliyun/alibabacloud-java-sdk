// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListClusterInspectReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListClusterInspectReportsResponseBody body;

    public static ListClusterInspectReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClusterInspectReportsResponse self = new ListClusterInspectReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListClusterInspectReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClusterInspectReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListClusterInspectReportsResponse setBody(ListClusterInspectReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClusterInspectReportsResponseBody getBody() {
        return this.body;
    }

}
