// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListJoinedOrganizationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListJoinedOrganizationsResponseBody body;

    public static ListJoinedOrganizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListJoinedOrganizationsResponse self = new ListJoinedOrganizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListJoinedOrganizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListJoinedOrganizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListJoinedOrganizationsResponse setBody(ListJoinedOrganizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListJoinedOrganizationsResponseBody getBody() {
        return this.body;
    }

}
