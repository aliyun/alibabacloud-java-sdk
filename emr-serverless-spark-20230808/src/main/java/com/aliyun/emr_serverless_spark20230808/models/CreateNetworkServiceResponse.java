// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateNetworkServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetworkServiceResponseBody body;

    public static CreateNetworkServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkServiceResponse self = new CreateNetworkServiceResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetworkServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetworkServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetworkServiceResponse setBody(CreateNetworkServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetworkServiceResponseBody getBody() {
        return this.body;
    }

}
