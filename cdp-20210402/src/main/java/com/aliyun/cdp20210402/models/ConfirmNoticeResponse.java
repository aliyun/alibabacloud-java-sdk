// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class ConfirmNoticeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConfirmNoticeResponseBody body;

    public static ConfirmNoticeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmNoticeResponse self = new ConfirmNoticeResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmNoticeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmNoticeResponse setBody(ConfirmNoticeResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmNoticeResponseBody getBody() {
        return this.body;
    }

}
