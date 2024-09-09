// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunAbbreviationContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunAbbreviationContentResponseBody body;

    public static RunAbbreviationContentResponse build(java.util.Map<String, ?> map) throws Exception {
        RunAbbreviationContentResponse self = new RunAbbreviationContentResponse();
        return TeaModel.build(map, self);
    }

    public RunAbbreviationContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunAbbreviationContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunAbbreviationContentResponse setBody(RunAbbreviationContentResponseBody body) {
        this.body = body;
        return this;
    }
    public RunAbbreviationContentResponseBody getBody() {
        return this.body;
    }

}
