// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ListAICPublicKeyDeliveriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAICPublicKeyDeliveriesResponseBody body;

    public static ListAICPublicKeyDeliveriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAICPublicKeyDeliveriesResponse self = new ListAICPublicKeyDeliveriesResponse();
        return TeaModel.build(map, self);
    }

    public ListAICPublicKeyDeliveriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAICPublicKeyDeliveriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAICPublicKeyDeliveriesResponse setBody(ListAICPublicKeyDeliveriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAICPublicKeyDeliveriesResponseBody getBody() {
        return this.body;
    }

}
