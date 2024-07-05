// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCustomGroupsResponseBody body;

    public static ListCustomGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCustomGroupsResponse self = new ListCustomGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListCustomGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCustomGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCustomGroupsResponse setBody(ListCustomGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCustomGroupsResponseBody getBody() {
        return this.body;
    }

}
