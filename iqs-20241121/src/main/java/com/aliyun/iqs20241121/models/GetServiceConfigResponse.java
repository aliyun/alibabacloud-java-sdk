// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ServiceConfigResult body;

    public static GetServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConfigResponse self = new GetServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceConfigResponse setBody(ServiceConfigResult body) {
        this.body = body;
        return this;
    }
    public ServiceConfigResult getBody() {
        return this.body;
    }

}
