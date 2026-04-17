// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContactGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContactGroupsResponseBody body;

    public static ListContactGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContactGroupsResponse self = new ListContactGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListContactGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContactGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContactGroupsResponse setBody(ListContactGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContactGroupsResponseBody getBody() {
        return this.body;
    }

}
