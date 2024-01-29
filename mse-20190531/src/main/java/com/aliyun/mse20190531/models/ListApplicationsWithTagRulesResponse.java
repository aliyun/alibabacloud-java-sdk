// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListApplicationsWithTagRulesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationsWithTagRulesResponseBody body;

    public static ListApplicationsWithTagRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsWithTagRulesResponse self = new ListApplicationsWithTagRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationsWithTagRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationsWithTagRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationsWithTagRulesResponse setBody(ListApplicationsWithTagRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationsWithTagRulesResponseBody getBody() {
        return this.body;
    }

}
