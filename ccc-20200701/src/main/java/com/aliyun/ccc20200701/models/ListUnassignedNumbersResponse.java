// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListUnassignedNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUnassignedNumbersResponseBody body;

    public static ListUnassignedNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnassignedNumbersResponse self = new ListUnassignedNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListUnassignedNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUnassignedNumbersResponse setBody(ListUnassignedNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUnassignedNumbersResponseBody getBody() {
        return this.body;
    }

}
