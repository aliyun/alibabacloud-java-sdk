// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class QueryAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ServerResponseQueryAlertRulesResult body;

    public static QueryAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertRulesResponse self = new QueryAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAlertRulesResponse setBody(ServerResponseQueryAlertRulesResult body) {
        this.body = body;
        return this;
    }
    public ServerResponseQueryAlertRulesResult getBody() {
        return this.body;
    }

}
