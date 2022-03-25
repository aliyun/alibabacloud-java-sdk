// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderAssignedScanISVResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OrderAssignedScanISVResponseBody body;

    public static OrderAssignedScanISVResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderAssignedScanISVResponse self = new OrderAssignedScanISVResponse();
        return TeaModel.build(map, self);
    }

    public OrderAssignedScanISVResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderAssignedScanISVResponse setBody(OrderAssignedScanISVResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderAssignedScanISVResponseBody getBody() {
        return this.body;
    }

}
