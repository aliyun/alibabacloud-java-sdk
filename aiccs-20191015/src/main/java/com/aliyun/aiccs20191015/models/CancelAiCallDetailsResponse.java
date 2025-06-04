// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class CancelAiCallDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelAiCallDetailsResponseBody body;

    public static CancelAiCallDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAiCallDetailsResponse self = new CancelAiCallDetailsResponse();
        return TeaModel.build(map, self);
    }

    public CancelAiCallDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAiCallDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAiCallDetailsResponse setBody(CancelAiCallDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAiCallDetailsResponseBody getBody() {
        return this.body;
    }

}
