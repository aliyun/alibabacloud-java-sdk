// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListModelGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelGroupsResponseBody body;

    public static ListModelGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelGroupsResponse self = new ListModelGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelGroupsResponse setBody(ListModelGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelGroupsResponseBody getBody() {
        return this.body;
    }

}
