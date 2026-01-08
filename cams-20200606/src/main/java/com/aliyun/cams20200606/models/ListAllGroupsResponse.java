// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListAllGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAllGroupsResponseBody body;

    public static ListAllGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAllGroupsResponse self = new ListAllGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAllGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAllGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAllGroupsResponse setBody(ListAllGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAllGroupsResponseBody getBody() {
        return this.body;
    }

}
