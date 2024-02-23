// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListServerGroupsResponseBody body;

    public static ListServerGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsResponse self = new ListServerGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServerGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListServerGroupsResponse setBody(ListServerGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListServerGroupsResponseBody getBody() {
        return this.body;
    }

}
