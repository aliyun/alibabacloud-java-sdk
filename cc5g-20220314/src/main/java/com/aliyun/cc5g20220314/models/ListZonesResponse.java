// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class ListZonesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListZonesResponseBody body;

    public static ListZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListZonesResponse self = new ListZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListZonesResponse setBody(ListZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListZonesResponseBody getBody() {
        return this.body;
    }

}
