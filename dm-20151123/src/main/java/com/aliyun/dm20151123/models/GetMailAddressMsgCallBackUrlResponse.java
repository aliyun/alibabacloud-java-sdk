// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetMailAddressMsgCallBackUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMailAddressMsgCallBackUrlResponseBody body;

    public static GetMailAddressMsgCallBackUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMailAddressMsgCallBackUrlResponse self = new GetMailAddressMsgCallBackUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetMailAddressMsgCallBackUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMailAddressMsgCallBackUrlResponse setBody(GetMailAddressMsgCallBackUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMailAddressMsgCallBackUrlResponseBody getBody() {
        return this.body;
    }

}
