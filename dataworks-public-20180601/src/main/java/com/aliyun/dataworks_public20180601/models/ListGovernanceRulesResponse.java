// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class ListGovernanceRulesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListGovernanceRulesResponseBody body;

    public static ListGovernanceRulesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGovernanceRulesResponse self = new ListGovernanceRulesResponse();
        return TeaModel.build(map, self);
    }

    public ListGovernanceRulesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGovernanceRulesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGovernanceRulesResponse setBody(ListGovernanceRulesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGovernanceRulesResponseBody getBody() {
        return this.body;
    }

}
