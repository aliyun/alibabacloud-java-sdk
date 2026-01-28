// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListAuthorizationRulesForGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthorizationRulesForGroupResponseBody body;

    public static ListAuthorizationRulesForGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationRulesForGroupResponse self = new ListAuthorizationRulesForGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationRulesForGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationRulesForGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationRulesForGroupResponse setBody(ListAuthorizationRulesForGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationRulesForGroupResponseBody getBody() {
        return this.body;
    }

}
