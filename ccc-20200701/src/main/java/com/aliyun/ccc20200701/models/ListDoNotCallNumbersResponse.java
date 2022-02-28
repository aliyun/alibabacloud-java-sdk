// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListDoNotCallNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDoNotCallNumbersResponseBody body;

    public static ListDoNotCallNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDoNotCallNumbersResponse self = new ListDoNotCallNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListDoNotCallNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDoNotCallNumbersResponse setBody(ListDoNotCallNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDoNotCallNumbersResponseBody getBody() {
        return this.body;
    }

}
