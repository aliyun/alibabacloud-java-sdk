// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForResourceServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGroupsForResourceServerResponseBody body;

    public static ListGroupsForResourceServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForResourceServerResponse self = new ListGroupsForResourceServerResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupsForResourceServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupsForResourceServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupsForResourceServerResponse setBody(ListGroupsForResourceServerResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupsForResourceServerResponseBody getBody() {
        return this.body;
    }

}
