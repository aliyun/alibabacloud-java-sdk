// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListTaskGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTaskGroupsResponseBody body;

    public static ListTaskGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskGroupsResponse self = new ListTaskGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskGroupsResponse setBody(ListTaskGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTaskGroupsResponseBody getBody() {
        return this.body;
    }

}
