// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class ListInstancesByNcdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListInstancesByNcdResponseBody body;

    public static ListInstancesByNcdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesByNcdResponse self = new ListInstancesByNcdResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesByNcdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesByNcdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInstancesByNcdResponse setBody(ListInstancesByNcdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesByNcdResponseBody getBody() {
        return this.body;
    }

}
