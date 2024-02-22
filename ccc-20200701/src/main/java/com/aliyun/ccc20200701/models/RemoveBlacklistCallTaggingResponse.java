// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemoveBlacklistCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveBlacklistCallTaggingResponseBody body;

    public static RemoveBlacklistCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveBlacklistCallTaggingResponse self = new RemoveBlacklistCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public RemoveBlacklistCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveBlacklistCallTaggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveBlacklistCallTaggingResponse setBody(RemoveBlacklistCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveBlacklistCallTaggingResponseBody getBody() {
        return this.body;
    }

}
