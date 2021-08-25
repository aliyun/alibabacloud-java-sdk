// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class ListResultTokenUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResultTokenUrlResponseBody body;

    public static ListResultTokenUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResultTokenUrlResponse self = new ListResultTokenUrlResponse();
        return TeaModel.build(map, self);
    }

    public ListResultTokenUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResultTokenUrlResponse setBody(ListResultTokenUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResultTokenUrlResponseBody getBody() {
        return this.body;
    }

}
