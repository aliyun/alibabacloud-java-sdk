// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListWorkItemAllFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkItemAllFieldsResponseBody body;

    public static ListWorkItemAllFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkItemAllFieldsResponse self = new ListWorkItemAllFieldsResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkItemAllFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkItemAllFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkItemAllFieldsResponse setBody(ListWorkItemAllFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkItemAllFieldsResponseBody getBody() {
        return this.body;
    }

}
