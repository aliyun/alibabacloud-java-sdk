// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListRecentGovernanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRecentGovernanceMetricsResponseBody body;

    public static ListRecentGovernanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRecentGovernanceMetricsResponse self = new ListRecentGovernanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ListRecentGovernanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRecentGovernanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRecentGovernanceMetricsResponse setBody(ListRecentGovernanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRecentGovernanceMetricsResponseBody getBody() {
        return this.body;
    }

}
