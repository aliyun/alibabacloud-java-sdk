// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListDictionariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDictionariesResponseBody body;

    public static ListDictionariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDictionariesResponse self = new ListDictionariesResponse();
        return TeaModel.build(map, self);
    }

    public ListDictionariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDictionariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDictionariesResponse setBody(ListDictionariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDictionariesResponseBody getBody() {
        return this.body;
    }

}
