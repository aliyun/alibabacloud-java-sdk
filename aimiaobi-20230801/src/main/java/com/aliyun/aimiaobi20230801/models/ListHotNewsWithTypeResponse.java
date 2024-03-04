// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListHotNewsWithTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotNewsWithTypeResponseBody body;

    public static ListHotNewsWithTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotNewsWithTypeResponse self = new ListHotNewsWithTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListHotNewsWithTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotNewsWithTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotNewsWithTypeResponse setBody(ListHotNewsWithTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotNewsWithTypeResponseBody getBody() {
        return this.body;
    }

}
