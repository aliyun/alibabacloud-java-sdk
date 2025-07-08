// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeletePhoneWhiteListNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePhoneWhiteListNewResponseBody body;

    public static DeletePhoneWhiteListNewResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneWhiteListNewResponse self = new DeletePhoneWhiteListNewResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhoneWhiteListNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhoneWhiteListNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePhoneWhiteListNewResponse setBody(DeletePhoneWhiteListNewResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhoneWhiteListNewResponseBody getBody() {
        return this.body;
    }

}
