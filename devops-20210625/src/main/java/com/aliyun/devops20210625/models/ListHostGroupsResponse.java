// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListHostGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHostGroupsResponseBody body;

    public static ListHostGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsResponse self = new ListHostGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHostGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHostGroupsResponse setBody(ListHostGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHostGroupsResponseBody getBody() {
        return this.body;
    }

}
