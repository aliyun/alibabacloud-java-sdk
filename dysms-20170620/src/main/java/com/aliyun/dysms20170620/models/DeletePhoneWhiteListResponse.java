// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DeletePhoneWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePhoneWhiteListResponseBody body;

    public static DeletePhoneWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePhoneWhiteListResponse self = new DeletePhoneWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DeletePhoneWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePhoneWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePhoneWhiteListResponse setBody(DeletePhoneWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePhoneWhiteListResponseBody getBody() {
        return this.body;
    }

}
