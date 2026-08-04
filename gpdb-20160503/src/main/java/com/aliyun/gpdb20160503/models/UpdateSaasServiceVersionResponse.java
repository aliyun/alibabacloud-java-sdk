// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateSaasServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSaasServiceVersionResponseBody body;

    public static UpdateSaasServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSaasServiceVersionResponse self = new UpdateSaasServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSaasServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSaasServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSaasServiceVersionResponse setBody(UpdateSaasServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSaasServiceVersionResponseBody getBody() {
        return this.body;
    }

}
