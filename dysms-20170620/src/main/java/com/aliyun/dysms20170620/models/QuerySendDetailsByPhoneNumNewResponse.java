// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySendDetailsByPhoneNumNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySendDetailsByPhoneNumNewResponseBody body;

    public static QuerySendDetailsByPhoneNumNewResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySendDetailsByPhoneNumNewResponse self = new QuerySendDetailsByPhoneNumNewResponse();
        return TeaModel.build(map, self);
    }

    public QuerySendDetailsByPhoneNumNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySendDetailsByPhoneNumNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySendDetailsByPhoneNumNewResponse setBody(QuerySendDetailsByPhoneNumNewResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySendDetailsByPhoneNumNewResponseBody getBody() {
        return this.body;
    }

}
