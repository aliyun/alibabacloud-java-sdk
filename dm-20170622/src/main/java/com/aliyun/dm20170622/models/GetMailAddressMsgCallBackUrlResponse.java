// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class GetMailAddressMsgCallBackUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public GetMailAddressMsgCallBackUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMailAddressMsgCallBackUrlResponse setBody(GetMailAddressMsgCallBackUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMailAddressMsgCallBackUrlResponseBody getBody() {
        return this.body;
    }

}
