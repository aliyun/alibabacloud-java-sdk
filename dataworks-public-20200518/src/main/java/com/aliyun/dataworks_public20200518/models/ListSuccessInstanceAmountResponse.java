// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListSuccessInstanceAmountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSuccessInstanceAmountResponseBody body;

    public static ListSuccessInstanceAmountResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSuccessInstanceAmountResponse self = new ListSuccessInstanceAmountResponse();
        return TeaModel.build(map, self);
    }

    public ListSuccessInstanceAmountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSuccessInstanceAmountResponse setBody(ListSuccessInstanceAmountResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSuccessInstanceAmountResponseBody getBody() {
        return this.body;
    }

}
