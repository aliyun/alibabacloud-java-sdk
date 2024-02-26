// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutProvisionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProvisionConfig body;

    public static PutProvisionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        PutProvisionConfigResponse self = new PutProvisionConfigResponse();
        return TeaModel.build(map, self);
    }

    public PutProvisionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutProvisionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutProvisionConfigResponse setBody(ProvisionConfig body) {
        this.body = body;
        return this;
    }
    public ProvisionConfig getBody() {
        return this.body;
    }

}
