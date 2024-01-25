// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudResourceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudResourceListResponseBody body;

    public static GetCloudResourceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceListResponse self = new GetCloudResourceListResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudResourceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudResourceListResponse setBody(GetCloudResourceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudResourceListResponseBody getBody() {
        return this.body;
    }

}
