// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListRiskItemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRiskItemsResponseBody body;

    public static ListRiskItemsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRiskItemsResponse self = new ListRiskItemsResponse();
        return TeaModel.build(map, self);
    }

    public ListRiskItemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRiskItemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRiskItemsResponse setBody(ListRiskItemsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRiskItemsResponseBody getBody() {
        return this.body;
    }

}
