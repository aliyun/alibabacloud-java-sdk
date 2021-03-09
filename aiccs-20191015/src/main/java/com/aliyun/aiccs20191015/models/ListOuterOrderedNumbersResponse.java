// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListOuterOrderedNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOuterOrderedNumbersResponseBody body;

    public static ListOuterOrderedNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOuterOrderedNumbersResponse self = new ListOuterOrderedNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListOuterOrderedNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOuterOrderedNumbersResponse setBody(ListOuterOrderedNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOuterOrderedNumbersResponseBody getBody() {
        return this.body;
    }

}
