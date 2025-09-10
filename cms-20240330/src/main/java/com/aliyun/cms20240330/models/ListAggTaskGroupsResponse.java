// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListAggTaskGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAggTaskGroupsResponseBody body;

    public static ListAggTaskGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAggTaskGroupsResponse self = new ListAggTaskGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListAggTaskGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAggTaskGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAggTaskGroupsResponse setBody(ListAggTaskGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAggTaskGroupsResponseBody getBody() {
        return this.body;
    }

}
