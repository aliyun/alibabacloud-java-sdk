// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListGroupsForApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupsForApplicationResponseBody body;

    public static ListGroupsForApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupsForApplicationResponse self = new ListGroupsForApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupsForApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupsForApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupsForApplicationResponse setBody(ListGroupsForApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupsForApplicationResponseBody getBody() {
        return this.body;
    }

}
