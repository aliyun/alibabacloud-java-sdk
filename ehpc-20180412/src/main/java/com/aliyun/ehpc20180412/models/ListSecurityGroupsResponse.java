// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListSecurityGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSecurityGroupsResponseBody body;

    public static ListSecurityGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityGroupsResponse self = new ListSecurityGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListSecurityGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSecurityGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSecurityGroupsResponse setBody(ListSecurityGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSecurityGroupsResponseBody getBody() {
        return this.body;
    }

}
