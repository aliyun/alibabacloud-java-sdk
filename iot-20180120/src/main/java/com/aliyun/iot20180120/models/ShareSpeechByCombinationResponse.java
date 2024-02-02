// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ShareSpeechByCombinationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ShareSpeechByCombinationResponseBody body;

    public static ShareSpeechByCombinationResponse build(java.util.Map<String, ?> map) throws Exception {
        ShareSpeechByCombinationResponse self = new ShareSpeechByCombinationResponse();
        return TeaModel.build(map, self);
    }

    public ShareSpeechByCombinationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ShareSpeechByCombinationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ShareSpeechByCombinationResponse setBody(ShareSpeechByCombinationResponseBody body) {
        this.body = body;
        return this;
    }
    public ShareSpeechByCombinationResponseBody getBody() {
        return this.body;
    }

}
