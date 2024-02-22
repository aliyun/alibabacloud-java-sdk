// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddBlacklistCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddBlacklistCallTaggingResponseBody body;

    public static AddBlacklistCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        AddBlacklistCallTaggingResponse self = new AddBlacklistCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public AddBlacklistCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddBlacklistCallTaggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddBlacklistCallTaggingResponse setBody(AddBlacklistCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public AddBlacklistCallTaggingResponseBody getBody() {
        return this.body;
    }

}
