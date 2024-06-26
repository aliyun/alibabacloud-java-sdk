// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetOssPropertiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssPropertiesResponseBody body;

    public static GetOssPropertiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssPropertiesResponse self = new GetOssPropertiesResponse();
        return TeaModel.build(map, self);
    }

    public GetOssPropertiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssPropertiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssPropertiesResponse setBody(GetOssPropertiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssPropertiesResponseBody getBody() {
        return this.body;
    }

}
