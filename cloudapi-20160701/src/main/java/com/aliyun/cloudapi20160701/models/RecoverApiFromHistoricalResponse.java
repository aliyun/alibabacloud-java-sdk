// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class RecoverApiFromHistoricalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RecoverApiFromHistoricalResponseBody body;

    public static RecoverApiFromHistoricalResponse build(java.util.Map<String, ?> map) throws Exception {
        RecoverApiFromHistoricalResponse self = new RecoverApiFromHistoricalResponse();
        return TeaModel.build(map, self);
    }

    public RecoverApiFromHistoricalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RecoverApiFromHistoricalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RecoverApiFromHistoricalResponse setBody(RecoverApiFromHistoricalResponseBody body) {
        this.body = body;
        return this;
    }
    public RecoverApiFromHistoricalResponseBody getBody() {
        return this.body;
    }

}
