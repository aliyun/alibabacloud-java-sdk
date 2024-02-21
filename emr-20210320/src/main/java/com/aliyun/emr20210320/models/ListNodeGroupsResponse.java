// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListNodeGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNodeGroupsResponseBody body;

    public static ListNodeGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeGroupsResponse self = new ListNodeGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNodeGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNodeGroupsResponse setBody(ListNodeGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNodeGroupsResponseBody getBody() {
        return this.body;
    }

}
