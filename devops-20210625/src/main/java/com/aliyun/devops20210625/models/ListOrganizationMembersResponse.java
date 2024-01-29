// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListOrganizationMembersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOrganizationMembersResponseBody body;

    public static ListOrganizationMembersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationMembersResponse self = new ListOrganizationMembersResponse();
        return TeaModel.build(map, self);
    }

    public ListOrganizationMembersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOrganizationMembersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOrganizationMembersResponse setBody(ListOrganizationMembersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOrganizationMembersResponseBody getBody() {
        return this.body;
    }

}
