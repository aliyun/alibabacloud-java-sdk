// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchUpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHttpApiMatchUpdateResponseBody body;

    public static SentinelHttpApiMatchUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchUpdateResponse self = new SentinelHttpApiMatchUpdateResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHttpApiMatchUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHttpApiMatchUpdateResponse setBody(SentinelHttpApiMatchUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHttpApiMatchUpdateResponseBody getBody() {
        return this.body;
    }

}
