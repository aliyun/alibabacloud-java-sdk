// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class ListChartRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListChartRepositoryResponseBody body;

    public static ListChartRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChartRepositoryResponse self = new ListChartRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public ListChartRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChartRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListChartRepositoryResponse setBody(ListChartRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChartRepositoryResponseBody getBody() {
        return this.body;
    }

}
