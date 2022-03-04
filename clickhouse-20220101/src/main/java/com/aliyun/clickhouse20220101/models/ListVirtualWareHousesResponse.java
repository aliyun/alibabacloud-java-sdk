// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20220101.models;

import com.aliyun.tea.*;

public class ListVirtualWareHousesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListVirtualWareHousesResponseBody body;

    public static ListVirtualWareHousesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualWareHousesResponse self = new ListVirtualWareHousesResponse();
        return TeaModel.build(map, self);
    }

    public ListVirtualWareHousesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVirtualWareHousesResponse setBody(ListVirtualWareHousesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVirtualWareHousesResponseBody getBody() {
        return this.body;
    }

}
