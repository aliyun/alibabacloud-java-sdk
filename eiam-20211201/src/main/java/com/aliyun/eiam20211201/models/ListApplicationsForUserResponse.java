// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsForUserResponseBody body;

    public static ListApplicationsForUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForUserResponse self = new ListApplicationsForUserResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsForUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsForUserResponse setBody(ListApplicationsForUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsForUserResponseBody getBody() {
        return this.body;
    }

}
