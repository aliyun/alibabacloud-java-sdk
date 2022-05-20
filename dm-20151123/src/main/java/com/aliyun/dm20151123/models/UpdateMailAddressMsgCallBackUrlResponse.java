// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateMailAddressMsgCallBackUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMailAddressMsgCallBackUrlResponseBody body;

    public static UpdateMailAddressMsgCallBackUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMailAddressMsgCallBackUrlResponse self = new UpdateMailAddressMsgCallBackUrlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMailAddressMsgCallBackUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMailAddressMsgCallBackUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMailAddressMsgCallBackUrlResponse setBody(UpdateMailAddressMsgCallBackUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMailAddressMsgCallBackUrlResponseBody getBody() {
        return this.body;
    }

}
