// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
