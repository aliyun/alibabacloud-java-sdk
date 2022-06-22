// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryPageableOrderRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPageableOrderRecordsResponseBody body;

    public static QueryPageableOrderRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPageableOrderRecordsResponse self = new QueryPageableOrderRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPageableOrderRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPageableOrderRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPageableOrderRecordsResponse setBody(QueryPageableOrderRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPageableOrderRecordsResponseBody getBody() {
        return this.body;
    }

}
