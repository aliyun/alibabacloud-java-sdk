// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListOncallContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOncallContactsResponseBody body;

    public static ListOncallContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOncallContactsResponse self = new ListOncallContactsResponse();
        return TeaModel.build(map, self);
    }

    public ListOncallContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOncallContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOncallContactsResponse setBody(ListOncallContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOncallContactsResponseBody getBody() {
        return this.body;
    }

}
