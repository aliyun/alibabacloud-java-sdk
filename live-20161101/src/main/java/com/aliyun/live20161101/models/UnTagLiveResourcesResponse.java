// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UnTagLiveResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnTagLiveResourcesResponseBody body;

    public static UnTagLiveResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        UnTagLiveResourcesResponse self = new UnTagLiveResourcesResponse();
        return TeaModel.build(map, self);
    }

    public UnTagLiveResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnTagLiveResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnTagLiveResourcesResponse setBody(UnTagLiveResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public UnTagLiveResourcesResponseBody getBody() {
        return this.body;
    }

}
