// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCloudAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCloudAccountResponseBody body;

    public static DeleteCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudAccountResponse self = new DeleteCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCloudAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCloudAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCloudAccountResponse setBody(DeleteCloudAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCloudAccountResponseBody getBody() {
        return this.body;
    }

}
