// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteSaasServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSaasServiceResponseBody body;

    public static DeleteSaasServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSaasServiceResponse self = new DeleteSaasServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSaasServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSaasServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSaasServiceResponse setBody(DeleteSaasServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSaasServiceResponseBody getBody() {
        return this.body;
    }

}
