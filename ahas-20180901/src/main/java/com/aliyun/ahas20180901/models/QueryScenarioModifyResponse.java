// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryScenarioModifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryScenarioModifyResponseBody body;

    public static QueryScenarioModifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScenarioModifyResponse self = new QueryScenarioModifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryScenarioModifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryScenarioModifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryScenarioModifyResponse setBody(QueryScenarioModifyResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryScenarioModifyResponseBody getBody() {
        return this.body;
    }

}
