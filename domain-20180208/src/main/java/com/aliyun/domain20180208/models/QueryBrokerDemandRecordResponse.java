// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class QueryBrokerDemandRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryBrokerDemandRecordResponseBody body;

    public static QueryBrokerDemandRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBrokerDemandRecordResponse self = new QueryBrokerDemandRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryBrokerDemandRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBrokerDemandRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBrokerDemandRecordResponse setBody(QueryBrokerDemandRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBrokerDemandRecordResponseBody getBody() {
        return this.body;
    }

}
