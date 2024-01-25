// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudAllResourceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudAllResourceListResponseBody body;

    public static GetCloudAllResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudAllResourceListResponse self = new GetCloudAllResourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudAllResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudAllResourceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudAllResourceListResponse setBody(GetCloudAllResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudAllResourceListResponseBody getBody() {
        return this.body;
    }

}
