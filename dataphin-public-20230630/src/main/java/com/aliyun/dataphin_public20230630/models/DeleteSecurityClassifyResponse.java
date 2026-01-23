// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteSecurityClassifyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSecurityClassifyResponseBody body;

    public static DeleteSecurityClassifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecurityClassifyResponse self = new DeleteSecurityClassifyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecurityClassifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecurityClassifyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSecurityClassifyResponse setBody(DeleteSecurityClassifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecurityClassifyResponseBody getBody() {
        return this.body;
    }

}
