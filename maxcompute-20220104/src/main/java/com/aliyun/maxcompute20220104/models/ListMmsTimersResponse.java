// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTimersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMmsTimersResponseBody body;

    public static ListMmsTimersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTimersResponse self = new ListMmsTimersResponse();
        return TeaModel.build(map, self);
    }

    public ListMmsTimersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMmsTimersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMmsTimersResponse setBody(ListMmsTimersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMmsTimersResponseBody getBody() {
        return this.body;
    }

}
