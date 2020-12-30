// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyiotapi20171111.models;

import com.aliyun.tea.*;

public class DoSendIotSmsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DoSendIotSmsResponseBody body;

    public static DoSendIotSmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DoSendIotSmsResponse self = new DoSendIotSmsResponse();
        return TeaModel.build(map, self);
    }

    public DoSendIotSmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DoSendIotSmsResponse setBody(DoSendIotSmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DoSendIotSmsResponseBody getBody() {
        return this.body;
    }

}
