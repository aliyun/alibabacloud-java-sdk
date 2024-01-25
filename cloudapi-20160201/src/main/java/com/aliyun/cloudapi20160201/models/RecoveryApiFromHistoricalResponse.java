// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RecoveryApiFromHistoricalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RecoveryApiFromHistoricalResponseBody body;

    public static RecoveryApiFromHistoricalResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoveryApiFromHistoricalResponse self = new RecoveryApiFromHistoricalResponse();
        return TeaModel.build(map, self);
    }

    public RecoveryApiFromHistoricalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoveryApiFromHistoricalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoveryApiFromHistoricalResponse setBody(RecoveryApiFromHistoricalResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoveryApiFromHistoricalResponseBody getBody() {
        return this.body;
    }

}
