// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class GetNormalServiceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ServiceConfigResult body;

    public static GetNormalServiceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNormalServiceConfigResponse self = new GetNormalServiceConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetNormalServiceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNormalServiceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNormalServiceConfigResponse setBody(ServiceConfigResult body) {
        this.body = body;
        return this;
    }
    public ServiceConfigResult getBody() {
        return this.body;
    }

}
