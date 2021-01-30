// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListOrderedNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOrderedNumbersResponseBody body;

    public static ListOrderedNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrderedNumbersResponse self = new ListOrderedNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListOrderedNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrderedNumbersResponse setBody(ListOrderedNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrderedNumbersResponseBody getBody() {
        return this.body;
    }

}
