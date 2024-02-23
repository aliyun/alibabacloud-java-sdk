// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SubmitHotlineTransferRegisterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitHotlineTransferRegisterResponseBody body;

    public static SubmitHotlineTransferRegisterResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitHotlineTransferRegisterResponse self = new SubmitHotlineTransferRegisterResponse();
        return TeaModel.build(map, self);
    }

    public SubmitHotlineTransferRegisterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitHotlineTransferRegisterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitHotlineTransferRegisterResponse setBody(SubmitHotlineTransferRegisterResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitHotlineTransferRegisterResponseBody getBody() {
        return this.body;
    }

}
