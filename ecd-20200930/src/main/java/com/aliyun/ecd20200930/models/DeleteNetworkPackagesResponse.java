// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNetworkPackagesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNetworkPackagesResponseBody body;

    public static DeleteNetworkPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNetworkPackagesResponse self = new DeleteNetworkPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNetworkPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNetworkPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNetworkPackagesResponse setBody(DeleteNetworkPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNetworkPackagesResponseBody getBody() {
        return this.body;
    }

}
