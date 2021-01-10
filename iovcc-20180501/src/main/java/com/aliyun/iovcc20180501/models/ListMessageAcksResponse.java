// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListMessageAcksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMessageAcksResponseBody body;

    public static ListMessageAcksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMessageAcksResponse self = new ListMessageAcksResponse();
        return TeaModel.build(map, self);
    }

    public ListMessageAcksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMessageAcksResponse setBody(ListMessageAcksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMessageAcksResponseBody getBody() {
        return this.body;
    }

}
