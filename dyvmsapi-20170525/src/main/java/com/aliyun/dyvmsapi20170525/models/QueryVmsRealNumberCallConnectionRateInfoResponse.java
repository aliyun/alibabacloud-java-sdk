// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVmsRealNumberCallConnectionRateInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryVmsRealNumberCallConnectionRateInfoResponseBody body;

    public static QueryVmsRealNumberCallConnectionRateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryVmsRealNumberCallConnectionRateInfoResponse self = new QueryVmsRealNumberCallConnectionRateInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryVmsRealNumberCallConnectionRateInfoResponse setBody(QueryVmsRealNumberCallConnectionRateInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryVmsRealNumberCallConnectionRateInfoResponseBody getBody() {
        return this.body;
    }

}
