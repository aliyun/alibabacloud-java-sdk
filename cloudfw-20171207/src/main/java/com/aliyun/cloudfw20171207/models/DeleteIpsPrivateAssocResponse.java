// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteIpsPrivateAssocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteIpsPrivateAssocResponseBody body;

    public static DeleteIpsPrivateAssocResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpsPrivateAssocResponse self = new DeleteIpsPrivateAssocResponse();
        return TeaModel.build(map, self);
    }

    public DeleteIpsPrivateAssocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteIpsPrivateAssocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteIpsPrivateAssocResponse setBody(DeleteIpsPrivateAssocResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteIpsPrivateAssocResponseBody getBody() {
        return this.body;
    }

}
