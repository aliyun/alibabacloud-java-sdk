// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListOfficeSiteUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOfficeSiteUsersResponseBody body;

    public static ListOfficeSiteUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeSiteUsersResponse self = new ListOfficeSiteUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListOfficeSiteUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOfficeSiteUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOfficeSiteUsersResponse setBody(ListOfficeSiteUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOfficeSiteUsersResponseBody getBody() {
        return this.body;
    }

}
