// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRemindsResponseBody body;

    public static ListRemindsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsResponse self = new ListRemindsResponse();
        return TeaModel.build(map, self);
    }

    public ListRemindsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRemindsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRemindsResponse setBody(ListRemindsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRemindsResponseBody getBody() {
        return this.body;
    }

}
