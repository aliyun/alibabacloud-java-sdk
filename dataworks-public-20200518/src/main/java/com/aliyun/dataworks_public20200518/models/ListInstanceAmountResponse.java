// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListInstanceAmountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstanceAmountResponseBody body;

    public static ListInstanceAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceAmountResponse self = new ListInstanceAmountResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceAmountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstanceAmountResponse setBody(ListInstanceAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceAmountResponseBody getBody() {
        return this.body;
    }

}
