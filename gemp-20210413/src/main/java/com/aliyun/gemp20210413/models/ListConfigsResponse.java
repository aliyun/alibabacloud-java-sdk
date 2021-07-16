// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListConfigsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigsResponseBody body;

    public static ListConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsResponse self = new ListConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigsResponse setBody(ListConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigsResponseBody getBody() {
        return this.body;
    }

}
