// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateEthereumClientUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateEthereumClientUserPasswordResponseBody body;

    public static UpdateEthereumClientUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEthereumClientUserPasswordResponse self = new UpdateEthereumClientUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEthereumClientUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEthereumClientUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEthereumClientUserPasswordResponse setBody(UpdateEthereumClientUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEthereumClientUserPasswordResponseBody getBody() {
        return this.body;
    }

}
