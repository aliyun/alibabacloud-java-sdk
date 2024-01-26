// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetCloudClusterAllUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudClusterAllUrlResponseBody body;

    public static GetCloudClusterAllUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudClusterAllUrlResponse self = new GetCloudClusterAllUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudClusterAllUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudClusterAllUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudClusterAllUrlResponse setBody(GetCloudClusterAllUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudClusterAllUrlResponseBody getBody() {
        return this.body;
    }

}
