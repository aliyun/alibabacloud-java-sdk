// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class GetProvisionConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProvisionConfig body;

    public static GetProvisionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionConfigResponse self = new GetProvisionConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetProvisionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetProvisionConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetProvisionConfigResponse setBody(ProvisionConfig body) {
        this.body = body;
        return this;
    }
    public ProvisionConfig getBody() {
        return this.body;
    }

}
