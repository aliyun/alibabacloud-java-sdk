// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryInstanceGaapCostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryInstanceGaapCostResponseBody body;

    public static QueryInstanceGaapCostResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceGaapCostResponse self = new QueryInstanceGaapCostResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceGaapCostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceGaapCostResponse setBody(QueryInstanceGaapCostResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceGaapCostResponseBody getBody() {
        return this.body;
    }

}
