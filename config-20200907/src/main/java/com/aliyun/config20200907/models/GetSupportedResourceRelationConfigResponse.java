// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetSupportedResourceRelationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupportedResourceRelationConfigResponseBody body;

    public static GetSupportedResourceRelationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupportedResourceRelationConfigResponse self = new GetSupportedResourceRelationConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetSupportedResourceRelationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupportedResourceRelationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupportedResourceRelationConfigResponse setBody(GetSupportedResourceRelationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupportedResourceRelationConfigResponseBody getBody() {
        return this.body;
    }

}
