// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListCostUnitOrdersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCostUnitOrdersResponseBody body;

    public static ListCostUnitOrdersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCostUnitOrdersResponse self = new ListCostUnitOrdersResponse();
        return TeaModel.build(map, self);
    }

    public ListCostUnitOrdersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCostUnitOrdersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCostUnitOrdersResponse setBody(ListCostUnitOrdersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCostUnitOrdersResponseBody getBody() {
        return this.body;
    }

}
