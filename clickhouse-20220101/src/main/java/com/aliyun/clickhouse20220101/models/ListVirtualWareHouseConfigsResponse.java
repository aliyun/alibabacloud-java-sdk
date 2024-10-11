// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListVirtualWareHouseConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVirtualWareHouseConfigsResponseBody body;

    public static ListVirtualWareHouseConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualWareHouseConfigsResponse self = new ListVirtualWareHouseConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualWareHouseConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualWareHouseConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVirtualWareHouseConfigsResponse setBody(ListVirtualWareHouseConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualWareHouseConfigsResponseBody getBody() {
        return this.body;
    }

}
