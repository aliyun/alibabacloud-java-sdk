// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListIntegrationPolicyCustomScrapeJobRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntegrationPolicyCustomScrapeJobRulesResponseBody body;

    public static ListIntegrationPolicyCustomScrapeJobRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationPolicyCustomScrapeJobRulesResponse self = new ListIntegrationPolicyCustomScrapeJobRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListIntegrationPolicyCustomScrapeJobRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntegrationPolicyCustomScrapeJobRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntegrationPolicyCustomScrapeJobRulesResponse setBody(ListIntegrationPolicyCustomScrapeJobRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntegrationPolicyCustomScrapeJobRulesResponseBody getBody() {
        return this.body;
    }

}
