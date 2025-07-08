// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendDetailsByPhoneNumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySendDetailsByPhoneNumResponseBody body;

    public static QuerySendDetailsByPhoneNumResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsByPhoneNumResponse self = new QuerySendDetailsByPhoneNumResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsByPhoneNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendDetailsByPhoneNumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySendDetailsByPhoneNumResponse setBody(QuerySendDetailsByPhoneNumResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendDetailsByPhoneNumResponseBody getBody() {
        return this.body;
    }

}
