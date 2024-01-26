// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchAlertRulesResponseBody body;

    public static SearchAlertRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertRulesResponse self = new SearchAlertRulesResponse();
        return TeaModel.build(map, self);
    }

    public SearchAlertRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchAlertRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchAlertRulesResponse setBody(SearchAlertRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchAlertRulesResponseBody getBody() {
        return this.body;
    }

}
