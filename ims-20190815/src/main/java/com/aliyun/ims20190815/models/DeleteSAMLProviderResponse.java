// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteSAMLProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSAMLProviderResponseBody body;

    public static DeleteSAMLProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSAMLProviderResponse self = new DeleteSAMLProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSAMLProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSAMLProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSAMLProviderResponse setBody(DeleteSAMLProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSAMLProviderResponseBody getBody() {
        return this.body;
    }

}
