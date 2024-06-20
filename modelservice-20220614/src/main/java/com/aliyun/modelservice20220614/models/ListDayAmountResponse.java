// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class ListDayAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDayAmountResponseBody body;

    public static ListDayAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDayAmountResponse self = new ListDayAmountResponse();
        return TeaModel.build(map, self);
    }

    public ListDayAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDayAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDayAmountResponse setBody(ListDayAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDayAmountResponseBody getBody() {
        return this.body;
    }

}
