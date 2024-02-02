// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SendDtmfSignalingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SendDtmfSignalingResponseBody body;

    public static SendDtmfSignalingResponse build(java.util.Map<String, ?> map) throws Exception {
        SendDtmfSignalingResponse self = new SendDtmfSignalingResponse();
        return TeaModel.build(map, self);
    }

    public SendDtmfSignalingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SendDtmfSignalingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SendDtmfSignalingResponse setBody(SendDtmfSignalingResponseBody body) {
        this.body = body;
        return this;
    }
    public SendDtmfSignalingResponseBody getBody() {
        return this.body;
    }

}
