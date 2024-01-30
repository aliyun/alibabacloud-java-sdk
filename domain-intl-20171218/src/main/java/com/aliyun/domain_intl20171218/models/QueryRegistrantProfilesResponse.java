// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryRegistrantProfilesResponseBody body;

    public static QueryRegistrantProfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfilesResponse self = new QueryRegistrantProfilesResponse();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRegistrantProfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRegistrantProfilesResponse setBody(QueryRegistrantProfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRegistrantProfilesResponseBody getBody() {
        return this.body;
    }

}
