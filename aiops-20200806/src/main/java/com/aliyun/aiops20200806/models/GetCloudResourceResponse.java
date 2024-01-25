// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetCloudResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCloudResourceResponseBody body;

    public static GetCloudResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCloudResourceResponse self = new GetCloudResourceResponse();
        return TeaModel.build(map, self);
    }

    public GetCloudResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCloudResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCloudResourceResponse setBody(GetCloudResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCloudResourceResponseBody getBody() {
        return this.body;
    }

}
