// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetCloudResourceDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudResourceDataResponseBody body;

    public static GetCloudResourceDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceDataResponse self = new GetCloudResourceDataResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudResourceDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudResourceDataResponse setBody(GetCloudResourceDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudResourceDataResponseBody getBody() {
        return this.body;
    }

}
