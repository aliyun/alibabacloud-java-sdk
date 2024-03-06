// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateApplicationAccessPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateApplicationAccessPointResponseBody body;

    public static UpdateApplicationAccessPointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationAccessPointResponse self = new UpdateApplicationAccessPointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationAccessPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateApplicationAccessPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateApplicationAccessPointResponse setBody(UpdateApplicationAccessPointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateApplicationAccessPointResponseBody getBody() {
        return this.body;
    }

}
