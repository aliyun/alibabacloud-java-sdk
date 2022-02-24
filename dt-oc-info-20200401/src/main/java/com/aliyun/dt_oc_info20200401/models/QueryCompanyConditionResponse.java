// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class QueryCompanyConditionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCompanyConditionResponseBody body;

    public static QueryCompanyConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCompanyConditionResponse self = new QueryCompanyConditionResponse();
        return TeaModel.build(map, self);
    }

    public QueryCompanyConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCompanyConditionResponse setBody(QueryCompanyConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCompanyConditionResponseBody getBody() {
        return this.body;
    }

}
