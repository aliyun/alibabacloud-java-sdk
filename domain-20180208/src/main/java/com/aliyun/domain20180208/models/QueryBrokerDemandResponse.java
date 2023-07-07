// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBrokerDemandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBrokerDemandResponseBody body;

    public static QueryBrokerDemandResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBrokerDemandResponse self = new QueryBrokerDemandResponse();
        return TeaModel.build(map, self);
    }

    public QueryBrokerDemandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBrokerDemandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBrokerDemandResponse setBody(QueryBrokerDemandResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBrokerDemandResponseBody getBody() {
        return this.body;
    }

}
