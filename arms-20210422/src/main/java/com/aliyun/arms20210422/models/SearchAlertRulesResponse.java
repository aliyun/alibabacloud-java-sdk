// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchAlertRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
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
