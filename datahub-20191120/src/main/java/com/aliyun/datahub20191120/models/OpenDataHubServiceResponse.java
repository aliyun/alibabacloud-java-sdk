// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20191120.models;

import com.aliyun.tea.*;

public class OpenDataHubServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenDataHubServiceResponseBody body;

    public static OpenDataHubServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenDataHubServiceResponse self = new OpenDataHubServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenDataHubServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenDataHubServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenDataHubServiceResponse setBody(OpenDataHubServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenDataHubServiceResponseBody getBody() {
        return this.body;
    }

}
