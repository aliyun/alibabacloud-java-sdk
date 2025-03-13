// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UntagCloudResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UntagCloudResourcesResponseBody body;

    public static UntagCloudResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UntagCloudResourcesResponse self = new UntagCloudResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UntagCloudResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UntagCloudResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UntagCloudResourcesResponse setBody(UntagCloudResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UntagCloudResourcesResponseBody getBody() {
        return this.body;
    }

}
