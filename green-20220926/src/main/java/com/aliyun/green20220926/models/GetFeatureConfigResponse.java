// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetFeatureConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFeatureConfigResponseBody body;

    public static GetFeatureConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeatureConfigResponse self = new GetFeatureConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetFeatureConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeatureConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFeatureConfigResponse setBody(GetFeatureConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeatureConfigResponseBody getBody() {
        return this.body;
    }

}
