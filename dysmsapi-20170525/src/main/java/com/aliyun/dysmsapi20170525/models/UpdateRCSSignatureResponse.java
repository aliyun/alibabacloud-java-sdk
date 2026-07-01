// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateRCSSignatureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateRCSSignatureResponseBody body;

    public static UpdateRCSSignatureResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateRCSSignatureResponse self = new UpdateRCSSignatureResponse();
        return TeaModel.build(map, self);
    }

    public UpdateRCSSignatureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateRCSSignatureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateRCSSignatureResponse setBody(UpdateRCSSignatureResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateRCSSignatureResponseBody getBody() {
        return this.body;
    }

}
