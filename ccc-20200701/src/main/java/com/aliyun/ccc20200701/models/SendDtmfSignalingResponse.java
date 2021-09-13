// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SendDtmfSignalingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SendDtmfSignalingResponse setBody(SendDtmfSignalingResponseBody body) {
        this.body = body;
        return this;
    }
    public SendDtmfSignalingResponseBody getBody() {
        return this.body;
    }

}
