// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySharedSpeechOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PageQuerySharedSpeechOpenResponseBody body;

    public static PageQuerySharedSpeechOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        PageQuerySharedSpeechOpenResponse self = new PageQuerySharedSpeechOpenResponse();
        return TeaModel.build(map, self);
    }

    public PageQuerySharedSpeechOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PageQuerySharedSpeechOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PageQuerySharedSpeechOpenResponse setBody(PageQuerySharedSpeechOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public PageQuerySharedSpeechOpenResponseBody getBody() {
        return this.body;
    }

}
