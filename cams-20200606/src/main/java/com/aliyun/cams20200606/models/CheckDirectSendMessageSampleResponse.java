// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CheckDirectSendMessageSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckDirectSendMessageSampleResponseBody body;

    public static CheckDirectSendMessageSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDirectSendMessageSampleResponse self = new CheckDirectSendMessageSampleResponse();
        return TeaModel.build(map, self);
    }

    public CheckDirectSendMessageSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckDirectSendMessageSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckDirectSendMessageSampleResponse setBody(CheckDirectSendMessageSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckDirectSendMessageSampleResponseBody getBody() {
        return this.body;
    }

}
