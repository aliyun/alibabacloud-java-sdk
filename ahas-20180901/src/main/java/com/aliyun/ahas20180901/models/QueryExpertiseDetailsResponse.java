// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryExpertiseDetailsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryExpertiseDetailsResponseBody body;

    public static QueryExpertiseDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryExpertiseDetailsResponse self = new QueryExpertiseDetailsResponse();
        return TeaModel.build(map, self);
    }

    public QueryExpertiseDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryExpertiseDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryExpertiseDetailsResponse setBody(QueryExpertiseDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryExpertiseDetailsResponseBody getBody() {
        return this.body;
    }

}
