// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class ListEgressProxyRuleGroupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEgressProxyRuleGroupsResponseBody body;

    public static ListEgressProxyRuleGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEgressProxyRuleGroupsResponse self = new ListEgressProxyRuleGroupsResponse();
        return TeaModel.build(map, self);
    }

    public ListEgressProxyRuleGroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEgressProxyRuleGroupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEgressProxyRuleGroupsResponse setBody(ListEgressProxyRuleGroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEgressProxyRuleGroupsResponseBody getBody() {
        return this.body;
    }

}
