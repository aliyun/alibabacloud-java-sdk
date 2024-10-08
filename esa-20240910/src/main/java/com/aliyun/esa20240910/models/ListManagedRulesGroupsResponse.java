// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListManagedRulesGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListManagedRulesGroupsResponseBody body;

    public static ListManagedRulesGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListManagedRulesGroupsResponse self = new ListManagedRulesGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListManagedRulesGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListManagedRulesGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListManagedRulesGroupsResponse setBody(ListManagedRulesGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListManagedRulesGroupsResponseBody getBody() {
        return this.body;
    }

}
