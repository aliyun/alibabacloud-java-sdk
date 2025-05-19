// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class ListMyGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMyGroupsResponseBody body;

    public static ListMyGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMyGroupsResponse self = new ListMyGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListMyGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMyGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMyGroupsResponse setBody(ListMyGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMyGroupsResponseBody getBody() {
        return this.body;
    }

}
