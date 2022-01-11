// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class DataRateLimitTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DataRateLimitTestResponseBody body;

    public static DataRateLimitTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DataRateLimitTestResponse self = new DataRateLimitTestResponse();
        return TeaModel.build(map, self);
    }

    public DataRateLimitTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DataRateLimitTestResponse setBody(DataRateLimitTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DataRateLimitTestResponseBody getBody() {
        return this.body;
    }

}
