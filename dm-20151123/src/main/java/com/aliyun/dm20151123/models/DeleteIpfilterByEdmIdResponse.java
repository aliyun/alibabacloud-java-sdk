// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteIpfilterByEdmIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpfilterByEdmIdResponseBody body;

    public static DeleteIpfilterByEdmIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpfilterByEdmIdResponse self = new DeleteIpfilterByEdmIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpfilterByEdmIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpfilterByEdmIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpfilterByEdmIdResponse setBody(DeleteIpfilterByEdmIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpfilterByEdmIdResponseBody getBody() {
        return this.body;
    }

}
