// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelHttpApiMatchUpdateDefaultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SentinelHttpApiMatchUpdateDefaultResponseBody body;

    public static SentinelHttpApiMatchUpdateDefaultResponse build(java.util.Map<String, ?> map) throws Exception {
        SentinelHttpApiMatchUpdateDefaultResponse self = new SentinelHttpApiMatchUpdateDefaultResponse();
        return TeaModel.build(map, self);
    }

    public SentinelHttpApiMatchUpdateDefaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SentinelHttpApiMatchUpdateDefaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SentinelHttpApiMatchUpdateDefaultResponse setBody(SentinelHttpApiMatchUpdateDefaultResponseBody body) {
        this.body = body;
        return this;
    }
    public SentinelHttpApiMatchUpdateDefaultResponseBody getBody() {
        return this.body;
    }

}
