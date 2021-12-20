// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class ListAPNsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAPNsResponseBody body;

    public static ListAPNsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAPNsResponse self = new ListAPNsResponse();
        return TeaModel.build(map, self);
    }

    public ListAPNsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAPNsResponse setBody(ListAPNsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAPNsResponseBody getBody() {
        return this.body;
    }

}
